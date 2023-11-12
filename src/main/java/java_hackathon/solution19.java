package java_hackathon;

public class solution19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Hello World";
		// Initialize an array to hold the count of each character
		int[] charCount = new int[256]; // Assuming ASCII characters
		// Count the occurrences of each character
		for (char c : inputString.toCharArray()) {
		charCount[c]++;
		}
		// Display the results
		for (int i = 0; i < charCount.length; i++) {
		if (charCount[i] > 0) {
		System.out.println((char) i + ": " + charCount[i]);
		}
		}
		}
		
	}


