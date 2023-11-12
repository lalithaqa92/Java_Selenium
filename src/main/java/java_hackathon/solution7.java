package java_hackathon;

public class solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isStringPalindrome = isPalindrome(inputString);
		boolean isNumberPalindrome = isPalindrome(inputNumber);
		System.out.println("Is '" + inputString + "' a palindrome? " +
		isStringPalindrome);
		System.out.println("Is " + inputNumber + " a palindrome? " +
		isNumberPalindrome);
		}
		public static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
		if (str.charAt(left) != str.charAt(right)) {
		return false;
		}
		left++;
		right--;
		}
		return true;
		}
		public static boolean isPalindrome(long num) {
		long originalNum = num;
		long reversedNum = 0;
		while (num > 0) {
		long digit = num % 10;
		reversedNum = reversedNum * 10 + digit;
		num /= 10;
		}

		return originalNum == reversedNum;
		}
		


	}


