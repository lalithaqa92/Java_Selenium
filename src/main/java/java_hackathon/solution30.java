package java_hackathon;

public class solution30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "abacdfgdcaba";
		String longestPalindrome = findLongestPalindrome(inputString);
		System.out.println("Longest Palindrome: " + longestPalindrome);
	}

	public static String findLongestPalindrome(String str) {
		String longestPalindrome = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String currentSubstr = str.substring(i, j);
				if (isPalindrome(currentSubstr) && currentSubstr.length() >

						longestPalindrome.length()) {

					longestPalindrome = currentSubstr;
				}
			}
		}
		return longestPalindrome;
	}

	public static boolean isPalindrome(String str) {
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
}
