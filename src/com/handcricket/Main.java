package com.handcricket;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {

		System.out.println("Aarambikaangala??");
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("Enter your input:");
		do {
			input = sc.nextLine();
			System.out.println(input);
		} while(!input.toLowerCase().equals("exit"));
		
		System.out.println("Exiting....");
	}

}
