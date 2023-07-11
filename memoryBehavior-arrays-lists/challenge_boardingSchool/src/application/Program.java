package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rent[] rent = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			sc.nextLine();
			System.out.println();
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			while(rent[room]!=null) {
				System.out.println();
				System.out.println("This room is already rented!Choose another one.");
				System.out.print("Available rooms: ");
				for(int j=0; j<n; j++) {
					if(rent[j]==null) System.out.print(j+" ");
				}
				System.out.println();
				System.out.println();
				System.out.print("New room: ");
				room = sc.nextInt();
			}
			
			rent[room] = new Rent(name, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for(int i=0; i<rent.length; i++) {
			if(rent[i] != null) System.out.println(rent[i].getRoom()+": " + rent[i].getName() + ", " + rent[i].getEmail());
		}
		
		sc.close();
	}
}
