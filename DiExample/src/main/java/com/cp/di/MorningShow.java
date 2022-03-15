package com.cp.di;

import org.springframework.stereotype.Component;

@Component
public class MorningShow implements Show{   //id = morningShow

	@Override
	public void watch() {
		
		System.out.println(" Watching Morning Show ...!");
	}

}
