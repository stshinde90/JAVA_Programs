package com.programs;

public class SmallestFromMultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][]= {{3,12,4}, {5,1,9}, {9,6,7}};
		int min = abc[0][0];
		int minColumn = 0;
		
		for(int i=0; i<3;i++) {
			for (int j=0; j<3;j++) {
				if(abc[i][j]<min) {
					min = abc[i][j];
					minColumn = j;
				}
			}
		}
        System.out.println("The smallest no in array is "+min);
        int maxValue= abc[0][minColumn];
        int k=0;
        while(k<3) {
        	if(abc[k][minColumn]>maxValue) {
        		maxValue= abc[k][minColumn];
        	}
        	k++;
        }
        System.out.println("The greatest no is "+maxValue);
	}

}
