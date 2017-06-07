package io.renren.dto;

import java.math.BigDecimal;

/**
 * @author Administrator
 *
 */
public class MatchProductDto {
	
	public String getASIN() {
		return ASIN;
	}

	public void setASIN(String aSIN) {
		ASIN = aSIN;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getSmallImg() {
		return smallImg;
	}

	public void setSmallImg(String smallImg) {
		this.smallImg = smallImg;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}



	private String ASIN;
	
	private String  price;
	
	private String smallImg;
	
	private String brandName;
	
	

}
