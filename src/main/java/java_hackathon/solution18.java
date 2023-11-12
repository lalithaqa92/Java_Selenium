package java_hackathon;

public class solution18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Hello World";
		System.out.println("Duplicate characters in the string:");
		char[] characters = inputString.toCharArray();
		for (int i = 0; i < characters.length; i++) {
		for (int j = i + 1; j < characters.length; j++) {
		if (characters[i] == characters[j] && characters[i] != ' ' &&

		characters[i] != '0') {

		System.out.println(characters[i]);
		characters[j] = '0'; // Mark as visited to avoid duplicates in

		
		}
		}
		}
		}
	
	}


