package com.handcricket;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		int userScore;
		userScore = playInnings("Batting");
		System.out.println("User Score:" + userScore);
	}
	

	
	public static int playInnings(String currentRound) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		Random rand = new Random();
		int score = 0;
		int cpuInput;
		int userInput;
		System.out.println("Aarambikaangala??");
		do {
			System.out.println("Enter your input:");
			input = sc.nextLine();		
			try {
				if (!(input.toLowerCase().equals("exit"))) {
					cpuInput = rand.nextInt(7);
					System.out.println("User:" + input);
					System.out.println("CPU:" + cpuInput);
					userInput = Integer.parseInt(input);
					if (!(userInput > 0 && userInput < 7)) {
						throw new Exception("Invalid input");
					}
					if(cpuInput == userInput) {
						System.out.println("OUT!!!!");
						input = "exit";
					}
					else {
						score += userInput;
					}
					System.out.println("Current score:" + score);					
				}

			} catch(Exception e) {
				System.out.println(e);
				input = "exit";
			}
			
		} while(!input.toLowerCase().equals("exit"));
		
		System.out.println("Final Score:" + score);
		System.out.println("Exiting....");
		sc.close();			
		return score;
	}
}
