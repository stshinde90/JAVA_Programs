package com.programs;

public class FindYounger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=30;
		int c=10;
		
		if(a==b && b==c) {
			System.out.println("all are same");
		}
		else if(a<b && a<c) {
			
			System.out.println("a is smaller");
		}
		else if(b<a && b<c)
		{
			System.out.println("b is smaller");
		}
		else if(c<a && c<b) {
			System.out.println("c is smaller");
		}
		}

}
