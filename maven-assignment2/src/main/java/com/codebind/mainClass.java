package com.codebind;

public class mainClass {
	
	public static void main(String[] args) throws Exception {
		
		try {
			Thread1 course = new Thread1();
			Thread2 days = new Thread2();	
			Thread3 list_course_SOC = new Thread3();
			Thread4 calc_course_SOC = new Thread4();
			Thread5 display = new Thread5();
			
			Thread t1 = new Thread(course);
			t1.start();
			t1.join();
			
			Thread t2 = new Thread(days);
			t2.start();
			t2.join();
			
			Thread t4 = new Thread(calc_course_SOC);
			t4.start();
			t4.join();
			
			Thread t3 = new Thread(list_course_SOC);
			t3.start();	
			t3.join();
	
			Thread t5 = new Thread(display);
			t5.start();
			
		}catch (Exception e) {
		    e.printStackTrace();
		}
		
		
	}
}