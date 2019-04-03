package com.codebind;

public class Thread2 extends readPDF implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int days=0,fisrtdate = 25, lastdate=20;;
		//Thread t1 = new Thread(new Thread1());
		super.run();
		
		System.out.println("");
		System.out.println("--------------");
		System.out.println("| Thread 2 : |");
		System.out.println("--------------");
		
		days = ((31-fisrtdate) + lastdate)-9;
		System.out.println("Total Number of Exam Days : " +days +" days");
		System.out.println("");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
