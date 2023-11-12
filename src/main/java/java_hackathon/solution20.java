package java_hackathon;

public class solution20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Hello World 123 hello world";
		int totalRepeatedIntegers = 0;
		int totalRepeatedUppercase = 0;
		int totalRepeatedLowercase = 0;
		int[] charCount = new int[256]; // Assuming ASCII characters

		for (char c : inputString.toCharArray()) {
		if (Character.isDigit(c)) {
		if (charCount[c] > 0) {
		totalRepeatedIntegers++;
		}
		} else if (Character.isUpperCase(c)) {
		if (charCount[c] > 0) {
		totalRepeatedUppercase++;
		}
		} else if (Character.isLowerCase(c)) {
		if (charCount[c] > 0) {
		totalRepeatedLowercase++;
		}
		}
		charCount[c]++;
		}
		System.out.println("Total Repeated Integers: " +
		totalRepeatedIntegers);
		System.out.println("Total Repeated Uppercase Characters: " +
		totalRepeatedUppercase);
		System.out.println("Total Repeated Lowercase Characters: " +
		totalRepeatedLowercase);
	}

}
