package java_hackathon;

public class solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 1, 4, 5, 4, 6, 7, 7}; // Replace this with your array
		Arrays.sort(arr);
		int currentNum = arr[0];
		int count = 1;
		System.out.println("Unique numbers and their frequencies:");
		for (int i = 1; i < arr.length; i++) {

		if (arr[i] == currentNum) {
		count++;
		} else {
		System.out.println(currentNum + " occurs " + count + " times");
		currentNum = arr[i];
		count = 1;
		}
		}
		System.out.println(currentNum + " occurs " + count + " times");
	}

	}

}
