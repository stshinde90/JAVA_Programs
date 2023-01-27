package interview_programs;

import java.util.ArrayList;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {1,2,3,4};
		int b [] = {6,2,5,4};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<a.length;i++) {
			if(a[i] == b[i])
			{
				al.add(a[i]);
			}
		}
		
		Object[] c = al.toArray();
		 for(Object obj : c) {
			 System.out.println(obj);
		 }
		

	}

}
