package myPackage02;

import java.util.Scanner;

public class TaxReport {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("inserisci valore:");
		double daTassare=scanner.nextDouble();
		calculateTax(daTassare);
		
	}
	
	public static void calculateTax(double importo)
	{
		if(importo>10000 && importo<20000)
			System.out.println(tax20(importo));
		if(importo>=20000 && importo<30000)
			System.out.println(tax30(importo));
		if(importo>=30000)
			System.out.println(taxOVER30(importo));
		if(importo<10000 && !(importo>20000) && !(importo>30000))
			System.out.println(tax10(importo));
		
	}
	
	public static double tax10(double val)
	{
		if(val>0) {
		double tax=(val/100)*10;
		return tax;}
		else
			return -1;
	}
	
	public static double tax20(double val)
	{
		if(val>0) {
		double t20= val-10000;
		double tax=(t20/100)*7;
		double ftax= tax10(10000)+tax;
		return ftax;
		}
		else
			return -1;

	}
	
	public static double tax30(double val)
	{
		if(val>0) {
		double t30= val-20000;
		double tax=(t30/100)*5;
		double ftax= tax20(20000)+tax;
		return ftax;
		
		}
		else 
			return -1;
		
		
	}
	
	public static double taxOVER30(double val)
	{
		if(val>0) {
		double to30= val-30000;
		double tax=(to30/100)*3;
		double ftax= tax30(30000)+tax;
		return ftax;
		
		}
		else 
			return -1;
	}
	
	
	

}


