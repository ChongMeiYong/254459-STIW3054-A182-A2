package com.codebind;

public class Thread1 extends readPDF implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int numCourse=0,i=0;
		//Thread t1 = new Thread(new Thread1());
		//Thread.sleep(2000);
		super.run();
		
		System.out.println("");
		System.out.println("--------------");
		System.out.println("| Thread 1 : |");
		System.out.println("--------------");
		
		for(i=0;i<text.length();i++) {
	  		if(text.contains(i +".")) 
	  			numCourse+=1; 
		} 	
		System.out.println("Total Number of Course: " + (numCourse-1));
		System.out.println("");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
