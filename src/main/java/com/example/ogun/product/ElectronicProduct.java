package com.example.ogun.product;

public abstract class ElectronicProduct {
	
	
	private String barcodeNo;
	private double money;
	
	
	public String getBarcodeNo() {
		return barcodeNo;
	}
	public void setBarcodeNo(String barcodeNo) {
		this.barcodeNo = barcodeNo;
	}
	protected double getMoney() {
		return money;
	}
	protected void setMoney(double money) {
		this.money = money;
	}
	public abstract void print();

	public ElectronicProduct(String barcodeNo, double money) {
		super();
		this.barcodeNo = barcodeNo;
		this.money = money;
		System.out.println("CONS... ElectronicProduct");

	}
	@Override
	public String toString() {
		return "ElectronicProduct [barcodeNo=" + barcodeNo + ", money=" + money + "]";
	}
	
}
