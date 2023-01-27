package com.programs;

public abstract class AbstractDemo {

	
	protected int a=90;
 //Private keyword is not allowed for methods and variables
  public void engine() {
	  System.out.println("Engine code is designed");
  }
  
  public void bodyShape() {
	  System.out.println("Body shape code is here");
  }
  
  public abstract void color();
  

}
