package com.programs;

public class SortingArray {

	public static void main(String[] args) {
		
		
		int abc[] = {5, 6, 9, 2, 3, 8, 6};
		int temp = 0;
		
		for(int i=0; i<abc.length;i++) {
			
			for(int j=i+1; j<abc.length; j++)
			{
				if(abc[i]>abc[j]) {
					temp = abc[i];
					abc[i] = abc[j];
					abc[j] = temp;
					
				}
			}
		}
		
		for(int i=0;i<abc.length;i++) {
			
			System.out.println(abc[i]);
		}

	}

}
