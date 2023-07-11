package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people? ");
		int n = sc.nextInt();
		
		Person[] person = new Person[n];
		double lowest = 2.9;
		double highest = 0.0;
		double totalHeightW = 0.0;
		int men = 0;
		int woman = 0;
		
		for(int i=0; i<person.length; i++) {
			System.out.print("Person " + (i+1) + " height: ");
			double height = sc.nextDouble();
			sc.nextLine();
			System.out.print("Person " + (i+1) + " gender: ");
			String gender = sc.nextLine();
			
			person[i] = new Person(height, gender);
			
			if(person[i].getHeight()>highest) {
				highest = person[i].getHeight();
			}
			if(person[i].getHeight()<lowest) {
				lowest = person[i].getHeight();
			}
			if(person[i].getGender().equals("M")) {
				men++;
			}
			if(person[i].getGender().equals("F")) {
				woman++;
				totalHeightW += person[i].getHeight();
			}
		}
		
		double avgWoman = totalHeightW/woman;
		
		System.out.println("Lowest height = " + lowest);
		System.out.println("Highest height = " + highest);
		System.out.println("Woman height average = " + String.format("%.2f", avgWoman));
		System.out.println("Amount of men = " + men);
		
		sc.close();
	}
}
