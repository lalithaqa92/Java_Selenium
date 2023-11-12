package java_hackathon;

public class solution16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Hello World";
		char charToRemove = 'l';
		String modifiedString = removeCharacter(inputString, charToRemove);

		System.out.println(modifiedString);
		}
		public static String removeCharacter(String str, char charToRemove) {
		StringBuilder result = new StringBuilder();
		for (char c : str.toCharArray()) {
		if (c != charToRemove) {
		result.append(c);
		}
	}
		String inputString = "Hello World";
		char charToRemove = 'l';
		String modifiedString = removeCharacter(inputString, charToRemove);

		System.out.println(modifiedString);
		}
		public static String removeCharacter(String str, char charToRemove) {
		StringBuilder result = new StringBuilder();
		for (char c : str.toCharArray()) {
		if (c != charToRemove) {
		result.append(c);
		}
		return result.toString();
				
				
				
				
				
				
				
				
				
		}
		

		}
}
