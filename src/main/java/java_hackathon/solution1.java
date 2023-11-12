package java_hackathon;

public class solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		boolean b = false;
		boolean c = true;
		if ((a && b) || (a && c) || (b && c)) {
		System.out.println("At least two out of three Booleans are true");
		} else {
		System.out.println("Less than two Booleans are true");
		}
	}

}
