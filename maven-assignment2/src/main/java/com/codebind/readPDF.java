package com.codebind;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
     
public class readPDF extends mainClass{
	
	public String text;
	public String [] txt;

	public void run(){	
		try {
		    PDDocument doc = PDDocument.load(new File("A182 Draft Stud.pdf"));
		    doc.getClass();
		    if(!doc.isEncrypted()) {
		    	PDFTextStripperByArea TstripperArea = new PDFTextStripperByArea();
		    	TstripperArea.setSortByPosition(true);
		    	PDFTextStripper Tstripper = new PDFTextStripper();
		    	text =  Tstripper.getText(doc);
		    	txt = text.split(System.getProperty("line.separator"));

				//System.out.println("Text in PDF: " + text );
				//System.out.println("Number of Course: " + (numCourse-1));
		    }      
		    doc.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

/*
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
*/
}
	

