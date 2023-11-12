package java_hackathon;

import java.util.Scanner;

public class solution24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive natural number N: ");

		int N = scanner.nextInt();
		System.out.println("Possible consecutive number combinations:");
		findConsecutiveCombinations(N);
		scanner.close();
	}

	public static void findConsecutiveCombinations(int N) {
		int start = 1;
		int end = 2;
		int sum = start + end;
		while (start <= N / 2) {
			if (sum == N) {
				printCombination(start, end);
				sum -= start;
				start++;
			} else if (sum < N) {
				end++;
				sum += end;
			} else {
				sum -= start;
				start++;
			}
		}
	}

	public static void printCombination(int start, int end) {
		System.out.print(start);
		for (int i = start + 1; i <= end; i++) {
			System.out.print(" + " + i);
		}
		System.out.println();
	}
}
