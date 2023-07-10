package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many people? ");
		int n = sc.nextInt();
		
		Person[] person = new Person[n];
		int older = 0;
		String olderName = "";
		
		for(int i=0; i<person.length; i++) {
			
			sc.nextLine();
			System.out.println("Person " + (i+1) + " data:");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			
			person[i] = new Person(name, age);
			if(person[i].getAge() > older) {
				older = person[i].getAge();
				olderName = person[i].getName();
			}
		}
		
		System.out.println("OLDER PERSON: " + olderName);
		
		sc.close();
	}

}
