package com.cp.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/*
 * 
 * What is spring bean?
 * 
 * Any java object created by spring is called spring bean and 
 * it will follow the lifecycle of any standard spring bean.
 */

@Component
public class Theatre {  //id = theatre
	
//	@Autowired
	private Show morningShow;
	
//	@Autowired
	private Show eveningShow;
	
	
	public Theatre(Show morningShow , Show eveningShow) {
		this.morningShow =  morningShow;
		this.eveningShow = eveningShow;
	}
	
	
	public void play() {
		
		morningShow.watch();
     	eveningShow.watch();
	}

}
