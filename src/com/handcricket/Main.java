package com.handcricket;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		int userScore, cpuScore;
		Scanner sc = new Scanner(System.in);
		userScore = playInnings(sc, "firstInnings", "user", -1);
		System.out.println("User Score:" + userScore);
		cpuScore = playInnings(sc, "secondInnings", "CPU", userScore);
		System.out.println("CPU Score:" + cpuScore);
		System.out.println("User Score:" + userScore);
		sc.close(); // scanner should be closed only at then end of the program.
	}
		
	public static int playInnings(Scanner sc, String innings, String playerType, int firstInningsScore) {
		
		String input;
		Random rand = new Random();
		int score = 0;
		int cpuInput;
		int userInput;
		//System.out.println("Aarambikaangala??");
		System.out.println(innings);
		//if (sc.hasNextLine()) {			
		//	input = sc.nextLine();		
	//	}
		do {
			System.out.println("Enter your input:");
			//input = "";
			//if (sc.hasNextLine()) {			
				input = sc.nextLine();		
			//}	
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
						if (innings.equals("secondInnings") && (playerType.equals("CPU"))) {
							System.out.println("User won!!!!");
						}
						if (innings.equals("secondInnings") && (playerType.equals("user")) ) {
							System.out.println("CPU won!!!!");
						}
						input = "exit";
					}
					else {
						if (playerType.equals("user")) {							
							score += userInput;
						} else {
							score +=cpuInput;
						}
						
						if(innings.equals("secondInnings") && playerType.equals("user") && score > firstInningsScore) {
							System.out.println("user won!!!");
							input = "exit";
						}
						if(innings.equals("secondInnings") && playerType.equals("CPU") && score > firstInningsScore) {
							System.out.println("CPU won!!!");
							input = "exit";
						}
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
		//sc.close();			
		return score;
	}
	
}
