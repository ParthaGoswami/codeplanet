package com.without.di;

public class Theatre {
	
	
	public void play() {
		
		/// Start Morning show
		// Show , MorningShow,EveningShow is dependency to theatre.
		// Dependent should not have ability to create its own dependency
		Show show = new MorningShow();
		// creating dependency -- not permitted in spring.
		show.watch();
	}

}
