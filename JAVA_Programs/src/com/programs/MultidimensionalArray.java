package com.programs;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 1;
		a[1][1] = 2;
		a[1][2] = 3;
		
		//System.out.println(a[1][0]);
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]);
				System.out.print("  ");
			}
			System.out.println(" ");
		}
		

	}

}
