package test;

import writer.IWriter;

public class Test {  //dependent
	
	private IWriter writer; // dependency

	public void setWriter(IWriter writer) {
		this.writer = writer;
	}
	
	public void run(){		
		String s = "This is my test";
		writer.writer(s);
	}
	
	
}
