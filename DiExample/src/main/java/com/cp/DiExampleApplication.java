package com.cp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cp.di.Theatre;


/****
 * 
 * Theatre will have a show.
 * Different kinds of Show are available (Morning Show An Evening Show).
 * Theatre has a method "play()".
 * Show can have a method watch().
 * Call method from main to start a show.
 */

@SpringBootApplication
public class DiExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DiExampleApplication.class, args);
		Theatre theatre = context.getBean(Theatre.class);
		theatre.play();
	}

}





