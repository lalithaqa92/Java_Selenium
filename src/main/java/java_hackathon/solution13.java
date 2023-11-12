package java_hackathon;

public class solution13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Java Code";
		String reversedString = reverseString(inputString);
		System.out.println(reversedString);
		}
		public static String reverseString(String str) {
		StringBuilder reversed = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
		reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}

}
