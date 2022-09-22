package com.inheritance_interface.bll;

public class TestEmployee {
	public static void main(String args[])
	{
		SalaryEmployee salariedEmployee =new SalaryEmployee("Elon Musk", "CEO",25000);
		
		HourlyEmployee hourlyEmployee=new HourlyEmployee("Peter","Executive",150,50);
		
		System.out.println(salariedEmployee);
		System.out.println(hourlyEmployee);
	}

}
