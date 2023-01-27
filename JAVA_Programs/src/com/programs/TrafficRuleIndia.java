package com.programs;

import collection.TrainTraffic;

public class TrafficRuleIndia implements TrafficSignalCommon, TrainTraffic {

	public static void main(String[] args) {
		System.out.println("This is Traffic system for India Country");
		TrafficSignalCommon tsc = new TrafficRuleIndia();
		System.out.println(a);
		//tsc.walkOnSymbol();
		tsc.greenGo();
		tsc.redStop();
		tsc.yellowObserve();

	}
	
	public void walkOnSymbol()
	{
		System.out.println("Walk on symbol");
	}
	
	

	@Override
	public void greenGo() {
		
		System.out.println("You can go");
		
	}

	@Override
	public void redStop() {
		
		System.out.println("You have to stop");
		
	}

	@Override
	public void yellowObserve() {
		
		System.out.println("Please stop if you are behind crossing");
		
	}

	@Override
	public void trainSignal() {
		// TODO Auto-generated method stub
		
	}

}
