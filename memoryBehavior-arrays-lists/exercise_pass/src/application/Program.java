package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students? ");
		int n = sc.nextInt();
		
		Student[] student = new Student[n];
		
		for(int i=0; i<student.length; i++) {
			
			sc.nextLine();
			System.out.println("Enter name, first and second grade of student " + (i+1) + ": ");
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			
			student[i] = new Student(name, grade1, grade2);
		}
		
		System.out.println("Passed students: ");
		for(int i=0; i<student.length; i++) {
			if(student[i].average()>= 6) {
				System.out.println(student[i].getName());
			}
		}
		sc.close();
	}
}
