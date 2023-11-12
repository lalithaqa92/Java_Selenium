package java_hackathon;

public class solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 2, 8, 12, 7}; // Replace this with your array
		// Sorting the array using Bubble Sort
		for (int i = 0; i < arr.length - 1; i++) {
		for (int j = 0; j < arr.length - i - 1; j++) {
		if (arr[j] > arr[j + 1]) {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
		}
		}
		}
		// Printing the sorted array
		for (int num : arr) {
		System.out.print(num + " ");}
	}

}
