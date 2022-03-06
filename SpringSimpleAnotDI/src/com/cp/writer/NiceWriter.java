package com.cp.writer;

import org.springframework.stereotype.Component;

@Component
public class NiceWriter implements IWriter {

	@Override
	public void writer(String s) {	
		
		System.out.println("NiceWriter :  " + s);
		
	}

}
