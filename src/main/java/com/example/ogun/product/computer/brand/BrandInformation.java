package com.example.ogun.product.computer.brand;

public abstract class BrandInformation {

	private String name;
	private int yearEstablished;
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getYearEstablished() {
		return yearEstablished;
	}
	protected void setYearEstablished(int yearEstablished) {
		this.yearEstablished = yearEstablished;
	}
	protected BrandInformation(String name, int yearEstablished) {
		super();
		this.name = name;
		this.yearEstablished = yearEstablished;
	}
	
}
