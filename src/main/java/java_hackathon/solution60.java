package java_hackathon;

public class solution60 {

	public static void main(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i += k) {

			int left = i;
			int right = Math.min(i + k - 1, arr.length - 1);
			while (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}

}
