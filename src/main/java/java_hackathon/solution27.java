package java_hackathon;

public class solution27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 4, 1, 7, 3, 10, 2, 5 };
		System.out.print("Original Array: ");
		printArray(arr);
		quickSort(arr, 0, arr.length - 1);
		System.out.print("Sorted Array: ");
		printArray(arr);
	}

	public static void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			int pivotIndex = partition(arr, left, right);

			quickSort(arr, left, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, right);
		}
	}

	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, right);
		return i + 1;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();

	}

}
