package main;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person person = new Person();
		person.setFirstName("CodePlanet");
		person.setLastName("Tutorial");
		person.setAge(25);
		person.setDob("19/09/2020");
			
		
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(person.getDob());
	}

}
