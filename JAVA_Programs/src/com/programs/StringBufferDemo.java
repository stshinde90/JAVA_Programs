package com.programs;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello";
		String b = "Hello";
		String s = new String("Hello");
		
		System.out.println(a.equals(b)); // true
		System.out.println(a==b);   // true
		System.out.println(a.equals(s));   //true
		System.out.println(a==s);   // false as "==" do a reference comparison
		
		// ".equals do a content comparison
		
		
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("world");
		System.out.println(sb);
		
		// String Builder is not thread safe and non synchronized
		
		

	}

}
