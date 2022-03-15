package com.cp.di;

import org.springframework.stereotype.Component;

@Component
public class EveningShow implements Show{  ///id = eveningShow

	@Override
	public void watch() { 
		
		System.out.println(" Watching Evening Show ...!");
		
	}

}
