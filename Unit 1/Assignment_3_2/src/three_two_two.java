import java.util.Scanner;

public class three_two_two {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What x: ");
		int x = in.nextInt();
		System.out.print("What y: ");
		int y = in.nextInt();
		System.out.print("What z: ");
		int z = in.nextInt();
		
		isTriangle(x ,y, z);
		in.close();
	}
	public static void isTriangle(int a, int b, int c) {
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
		
		
	}
}
