package com.codebind;

public class Thread3 extends readPDF implements Runnable{
	
	public int numCourse,num;

	@Override
	public void run() {
		// TODO Auto-generated method stub
	try {
		int i=0,a,j=0;
		String [] code = {"IA","ID","IJ","IK","IN","IW","QM","QS"};
		
		//Thread t3 = new Thread(new Thread3());
		super.run();
		
		System.out.println("");
		System.out.println("--------------");
		System.out.println("| Thread 3 : |");
		System.out.println("--------------");
		
		for(i=0;i<txt.length;i++) {
			for(a=1000;a<=5000;a++) {
				for(j=0;j<code.length;j++) {
					if(txt[i].contains("ST" +code[j] +a)) {
						System.out.println(txt[i]);
					}
				}
			}
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
