package com.cp.writer;

import org.springframework.stereotype.Component;

@Component
public class Writer implements IWriter{

	@Override
	public void writer(String s) {

		System.out.println("Writer :  " + s);
		
	}

}
