package com.gbin.executor.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)    
@XmlRootElement(name = "root")    
public class Root{  
    @XmlElement(name = "girl")    
    private List<Girl> girls;  
      
    public String toString(){  
        StringBuilder sb=new StringBuilder();  
        for(Girl girl:girls){  
            sb.append(girl.toString());  
        }  
        return sb.toString();  
    }  
  
    public List<Girl> getGirls() {return girls;}  
    public void setGirls(List<Girl> girls) {this.girls = girls;}  
} 