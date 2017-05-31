package com.gbin.executor.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)    
public class Girl {  
      
    @XmlElement(name = "name")  
    private String name;  
      
    @XmlElement(name = "age")  
    private String age;  
      
    @XmlElement(name = "cup")  
    private String cup;  
      
    public String toString(){  
      return name+","+age+","+cup+"\n";  
    }  
      
    public String getAge() {return age;}  
    public void setAge(String age) {this.age = age;}  
    public String getName() {return name;}  
    public void setName(String name) {this.name = name;}  
    public String getCup() {return cup;}  
    public void setCup(String cup) {this.cup = cup;}  
}
