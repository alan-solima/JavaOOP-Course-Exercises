package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Array;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values in each array? ");
		int n = sc.nextInt();
		
		Array[] vectA = new Array[n];
		Array[] vectB = new Array[n];
		Array[] vectC = new Array[n];
		
		int value = 0;
		
		System.out.println("Enter array A values: ");
		for(int i=0; i<vectA.length; i++) {
			value = sc.nextInt();
			vectA[i] = new Array(value);
		}
		
		System.out.println("Enter array B values: ");
		for(int i=0; i<vectB.length; i++) {
			value = sc.nextInt();
			vectB[i] = new Array(value);
		}
		
		int valueA = 0;
		int valueB = 0;
		
		System.out.println("RESULT ARRAY: ");
		for(int i=0; i<n; i++) {
			valueA = vectA[i].getValue();
			valueB = vectB[i].getValue();
			
			value = valueA + valueB;
			vectC[i] = new Array(value);
			System.out.println(vectC[i].getValue());
		}
		
		sc.close();
	}
}
