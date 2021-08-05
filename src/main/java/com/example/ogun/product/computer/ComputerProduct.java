package com.example.ogun.product.computer;

import com.example.ogun.product.ElectronicProduct;
import com.example.ogun.product.computer.brand.BrandInformation;

public abstract class ComputerProduct extends ElectronicProduct {

	private int ram;
	private int gpuSpeed;
	private String version;
	private double weight;
	private BrandInformation brandInformation;
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getGpuSpeed() {
		return gpuSpeed;
	}
	public void setGpuSpeed(int gpuSpeed) {
		this.gpuSpeed = gpuSpeed;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public BrandInformation getBrandInformation() {
		return brandInformation;
	}
	public void setBrandInformation(BrandInformation brandInformation) {
		this.brandInformation = brandInformation;
	}
	public ComputerProduct(String barcodeNo, double money, int ram, int gpuSpeed, String version, double weight,
			BrandInformation brandInformation) {
		super(barcodeNo, money);
		this.ram = ram;
		this.gpuSpeed = gpuSpeed;
		this.version = version;
		this.weight = weight;
		this.brandInformation = brandInformation;
		System.out.println("CONS... ComputerProduct");
	}
	@Override
	public String toString() {
		return "ComputerProduct [ram=" + ram + ", gpuSpeed=" + gpuSpeed + ", version=" + version + ", weight=" + weight
				+ ", brandInformation=" + brandInformation + "]";
	}


	
	
	
	
	
	
	
	
	
	
}
