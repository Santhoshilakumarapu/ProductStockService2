package net.java.beans;

import java.math.BigDecimal;

public class ProductStock {
	
	private Long id;
	private String productName;
	private BigDecimal productPrice;
	private String productAvailability;
	private double discountOffer;
	private int port;
	
	public ProductStock(Long id, String productName, BigDecimal productPrice, String productAvailability,
			double discountOffer,int port) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productAvailability = productAvailability;
		this.discountOffer = discountOffer;
		this.port = port;
	}
	

	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductAvailability() {
		return productAvailability;
	}

	public void setProductAvailability(String productAvailability) {
		this.productAvailability = productAvailability;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
}
