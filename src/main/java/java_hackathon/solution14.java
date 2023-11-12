package java_hackathon;

public class solution14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Java Code";
		String reversedString = "";
		for (int i = inputString.length() - 1; i >= 0; i--) {
		reversedString += inputString.charAt(i);
		}

		System.out.println(reversedString);
		}
		
	}


