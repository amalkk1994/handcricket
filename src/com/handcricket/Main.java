package com.handcricket;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String input;
		Random rand = new Random();
		int score = 0;
		int cpuInput;
		System.out.println("Aarambikaangala??");
		do {
			System.out.println("Enter your input:");
			input = sc.nextLine();
			cpuInput = rand.nextInt(7);
			System.out.println("User:" + input);
			System.out.println("CPU:" + cpuInput);
			try {
				if(cpuInput == Integer.parseInt(input)) {
					System.out.println("OUT!!!!");
					input = "exit";
				}
				else {
					score += Integer.parseInt(input);
				}
				System.out.println("Current score:" + score);
			} catch(NumberFormatException e) {
				System.out.println(e);
				input = "exit";
			}
			
		} while(!input.toLowerCase().equals("exit"));
		
		System.out.println("Final Score:" + score);
		System.out.println("Exiting....");
		sc.close();
	}

}
