package com.programs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/D/YYYY hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		Calendar cal = Calendar.getInstance();
		//sdf.format(cal.getTime());
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	    }
}
