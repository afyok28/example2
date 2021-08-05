package com.example.ogun.product.computer;

import com.example.ogun.product.computer.brand.BrandInformation;
import com.example.ogun.product.computer.model.Chassisproperties;
import com.example.ogun.product.service.ComputerCampaign;
import com.example.ogun.product.service.ComputerService;

public  class DesktopComputer extends ComputerProduct implements ComputerService , ComputerCampaign{

	private Chassisproperties chassisproperties;

	public Chassisproperties getChassisproperties() {
		return chassisproperties;
	}
	public void setChassisproperties(Chassisproperties chassisproperties) {
		this.chassisproperties = chassisproperties;
	}

	public DesktopComputer(String barcodeNo, double money, int ram, int gpuSpeed, String version, double weight,
			BrandInformation brandInformation, Chassisproperties chassisproperties) {
		super(barcodeNo, money, ram, gpuSpeed, version, weight, brandInformation);
		this.chassisproperties = chassisproperties;
	}
	@Override
	public String toString() {
		return "DesktopComputer [chassisproperties=" + chassisproperties + "]";
	}
	@Override
	public void print() {
		System.out.println(this.toString());
		
	}
	@Override
	public void updateMoney() {
		System.out.println(this.getMoney());
		this.setMoney(this.getMoney()-100);
		System.out.println(this.getMoney());
		
	}
	@Override
	public void gift() {
		System.out.println("MAUSE HEDİYE");
		
	}
}