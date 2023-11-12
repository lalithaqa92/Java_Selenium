package java_hackathon;

public class solution28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		long factorial = findFactorial(num);
		System.out.println("The factorial of " + num + " is: " + factorial);
	}

	public static long findFactorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * findFactorial(num - 1);
		}
	}

}
