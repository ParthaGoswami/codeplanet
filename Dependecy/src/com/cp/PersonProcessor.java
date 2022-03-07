package com.cp;

public class PersonProcessor {  // dependent on dependency
	
	public void process() {
		
		Person person = new Person(); // dependency
		
		System.out.println(person.getFirstName());
	}

}
