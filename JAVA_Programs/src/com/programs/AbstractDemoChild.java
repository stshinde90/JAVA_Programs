package com.programs;

public class AbstractDemoChild extends AbstractDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	AbstractDemoChild adc = new AbstractDemoChild();
	adc.color();
	adc.bodyShape();
	adc.engine();
	System.out.println(adc.a);

	}

	@Override
	public void color() {

    System.out.println("color code is available here");
		
	}

}
