package java_hackathon;

public class solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 1}; // Replace this with your array

		boolean isPalindrome = true;
		for (int i = 0; i < arr.length / 2; i++) {
		if (arr[i] != arr[arr.length - 1 - i]) {
		isPalindrome = false;
		break;
		}
		}
		if (isPalindrome) {
		System.out.println("The array is a palindrome.");
		} else {
		System.out.println("The array is not a palindrome.");
		}
	}

	}


