package com.programs;

//package coreJava;

public class ConstructDemo {
// Default
	public ConstructDemo()
{
System.out.println(" I am in the constructor");
System.out.println(" I am in the constructor lecture 1");


}
// Parameterized constructor

public ConstructDemo(int a, int b)
{
System.out.println(" I am in the parameterized constructor");
int c=a+b;
System.out.println(c);


}
public ConstructDemo(String str)
{
System.out.println(str);

}
public void getdata()
{

System.out.println("I am the method");
}

//will not return values
//name of constructor should be the class name

public static void main(String[] args) {
// TODO Auto-generated method stub
	
	ConstructDemo cds= new ConstructDemo();
	ConstructDemo cs= new ConstructDemo(3,3);

// compiler will call implict constructor if you have not defined constructor block
//when ever you create an object constructor is called
//block of code when ever an object is created
}

}
