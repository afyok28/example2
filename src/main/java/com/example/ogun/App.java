package com.example.ogun;

import com.example.ogun.product.computer.DesktopComputer;
import com.example.ogun.product.computer.brand.BrandInformation;
import com.example.ogun.product.computer.brand.Casper;
import com.example.ogun.product.computer.model.Chassisproperties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BrandInformation brandInformation=new Casper("NAME1", 1990);
    	DesktopComputer o=new DesktopComputer("11000", 150, 16, 3, "WİN 10", 4, brandInformation,new Chassisproperties(0, 0, 4));
    	o.print();
    	System.out.println(o.getChassisproperties().toString());
    	System.out.println(o.getWeight());
    	System.out.println(o.getGpuSpeed());
    	System.out.println(o.getBrandInformation().toString());
    	o.gift();
    	//o.updateMoney();
    }
}
