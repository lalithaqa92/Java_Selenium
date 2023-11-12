package java_hackathon;

import java.util.Scanner;

public class solution25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] binaryArray = new int[5];
		System.out.println("Enter 5 binary elements (0 or 1):");
		for (int i = 0; i < 5; i++) {
		int num = scanner.nextInt();
		if (num != 0 && num != 1) {
		System.out.println("Invalid input. Please enter 0 or 1.");
		return;
		}
		binaryArray[i] = num;
		}
		System.out.print("Enter the element to search for: ");
		int target = scanner.nextInt();
		int left = 0;
		int right = 4;
		while (left <= right) {
		int mid = left + (right - left) / 2;
		if (binaryArray[mid] == target) {
		System.out.println("Element found at index " + mid);
		return;

		}
		if (binaryArray[mid] < target) {
		left = mid + 1;
		} else {
		right = mid - 1;
		}
		}
		System.out.println("Element not found in the array.");
		scanner.close();
	}

}
