package com.codebind;

public class Thread5 extends readPDF implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	try {
		int i=0;
		//Thread t5 = new Thread(new Thread5());
		super.run();
		
		System.out.println("--------------");
		System.out.println("| Thread 5 : |");
		System.out.println("--------------");
		
		for(i=0;i<txt.length;i++) {
	  		if(txt[i].contains("STIW3054")) 
	  			System.out.println(txt[i]);
		} 
		System.out.println("");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}catch (ArrayIndexOutOfBoundsException e) {
	    e.printStackTrace();
	}
	}
}
