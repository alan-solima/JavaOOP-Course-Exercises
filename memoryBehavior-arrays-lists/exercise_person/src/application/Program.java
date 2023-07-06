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
		
		Person[] vect = new Person[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.printf("Person %s data: %n", i+1);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Age: ");
			int age = sc.nextInt();
			
			System.out.print("Height: ");
			double height = sc.nextDouble();
			
			vect[i] = new Person(name, age, height);
		}
		
		double sum = 0.0;
		double underSixteen = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getHeight();

			if(vect[i].getAge() < 16) {
				underSixteen ++;
			}
		}
		
		double avg = sum/vect.length;
		double percentage = (underSixteen/vect.length)*100;
		
		System.out.println();
		System.out.printf("Average height: %.2f%n", avg);
		System.out.printf("Under 16 years old people: %.2f%%%n", percentage);
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}
}
