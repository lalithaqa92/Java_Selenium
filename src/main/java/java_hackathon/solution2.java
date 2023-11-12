package java_hackathon;

public class solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; // Change this to calculate factorial of a different number
		long factorial = 1;
		if (n < 0) {
		System.out.println("Input must be a non-negative integer");
		} else {
		for (int i = 1; i <= n; i++) {
		factorial *= i;
		}
		System.out.println("Factorial of " + n + " is: " + factorial);
	}

}
	
}
