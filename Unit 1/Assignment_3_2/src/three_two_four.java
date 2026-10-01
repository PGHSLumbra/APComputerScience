import java.util.Scanner;

public class three_two_four {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What x: ");
		int x = in.nextInt();
		System.out.print("What y: ");
		int y = in.nextInt();
		
		testValue(x, y);
		in.close();
	}
	public static void testValue(int a, int b) {
		double total;
		total = ((double) a) / b;
		total = total * 100;
		System.out.print(total);
	}
}
