package com.programs;

public class VariableTypes 
{

	
	String name;  // instance Variable
	String Address; // instance Variable
	static String city="Mumbai"; // Static or Class variable
	
	VariableTypes(String name, String Address)
	{
		this.name = name;
		this.Address = Address;
		
	}
	
	public void getAddress()
	{
		System.out.println(Address+" "+city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		VariableTypes vt = new VariableTypes("Raj","LakeView");
		vt.getAddress();
	}

}
