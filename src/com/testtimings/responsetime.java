package com.testtimings;

public class responsetime {

	public static void main(String[] args) throws InterruptedException {
		
		long Start_Time = System.currentTimeMillis();
		Thread.sleep(2000l);
		long End_Time = System.currentTimeMillis();
		
		
		double response_time = (End_Time-Start_Time)/1000.0;
		 System.out.println(response_time);
		 double d = 123.45;
			String str = Double.toString(response_time);
			System.out.println(str); 
		
		
	}

}
