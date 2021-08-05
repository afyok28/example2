package com.example.ogun.product.computer;

import com.example.ogun.product.computer.brand.BrandInformation;
import com.example.ogun.product.service.ComputerService;

public class LeptopComputer extends ComputerProduct implements ComputerService {
	private boolean touchFeature;

	public boolean isTouchFeature() {
		return touchFeature;
	}

	public void setTouchFeature(boolean touchFeature) {
		this.touchFeature = touchFeature;
	}
	public LeptopComputer(String barcodeNo, double money, int ram, int gpuSpeed, String version, double weight,
			BrandInformation brandInformation) {
		super(barcodeNo, money, ram, gpuSpeed, version, weight, brandInformation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LeptopComputer [touchFeature=" + touchFeature + "]";
	}

	@Override
	public void print() {
		System.out.println(this.toString());
		
	}
	
}
