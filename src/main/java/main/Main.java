package main;

import entities.Person;

public class Main {

	public static void main(String[] args) {
		System.out.println("Program started.");

		Person p = new Person();
		String firstName = "first name";
		p.setFirstName(firstName);

		System.out.println("Program finished.");

	}

}
