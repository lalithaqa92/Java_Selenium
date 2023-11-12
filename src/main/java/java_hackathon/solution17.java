package java_hackathon;

public class solution17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Hello World 123";
		int totalIntegers = 0;
		int totalUppercase = 0;
		int totalLowercase = 0;
		for (char c : inputString.toCharArray()) {
		if (Character.isDigit(c)) {
		totalIntegers++;
		} else if (Character.isUpperCase(c)) {
		totalUppercase++;
		} else if (Character.isLowerCase(c)) {
		totalLowercase++;

		}
		}
		System.out.println("Total Integers: " + totalIntegers);
		System.out.println("Total Uppercase Characters: " + totalUppercase);
		System.out.println("Total Lowercase Characters:" + totalLowercase);
	}

}
