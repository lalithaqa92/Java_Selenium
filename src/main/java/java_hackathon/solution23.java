package java_hackathon;

import java.util.Scanner;

public class solution23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter something: ");
		String userInput = scanner.nextLine();
		if (isInteger(userInput)) {
		System.out.println("Input is an Integer.");
		} else if (isBoolean(userInput)) {

		System.out.println("Input is a Boolean.");
		} else {
		System.out.println("Input is a String.");
		}
		scanner.close();
		}
		public static boolean isInteger(String input) {
		try {
		Integer.parseInt(input);
		return true;
		} catch (NumberFormatException e) {
		return false;
		}
		}
		public static boolean isBoolean(String input) {
		return input.equalsIgnoreCase("true") ||
		input.equalsIgnoreCase("false");
	}

}
