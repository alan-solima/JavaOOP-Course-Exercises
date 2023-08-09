package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String outPath = "c:\\temp\\out\\summary.csv";
		String[] lines;
		String name;
		double price;
		int quantity;
		Double total;
		
		System.out.println("Enter a file path (.csv): ");
		String path = sc.nextLine();
		File sourcePath = new File(path);
		String sourcePathStr = sourcePath.getParent();
		
		boolean success = new File(sourcePathStr + "\\out").mkdir();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path)); BufferedWriter bw = new BufferedWriter(new FileWriter(outPath, true))) {
			String line = br.readLine();
		
			while(line != null) {
				lines = line.split(",");
				name = lines[0];
				price = Double.parseDouble(lines[1]);
				quantity = Integer.parseInt(lines[2]);
				total = price * quantity;

				bw.write(name + "," + String.format("%.2f", total));
				bw.newLine();

				line = br.readLine();
			}
			System.out.println(path + "/out/summary.csv Created!");
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		

		
		

	}

}
