import java.util.Scanner;

public class four_two {
	public static void main(String[] args) {
		int x1;
		int y1;
		int x2;
		int y2;
		double m;
		double b;
		
		Scanner in = new Scanner(System.in);

		System.out.print("What is the value of x1? ");
		x1 = in.nextInt();
		System.out.print("What is the value of y1? ");
		y1 = in.nextInt();
		System.out.print("What is the value of x2? ");
		x2 = in.nextInt();
		System.out.print("What is the value of y2? ");
		y2 = in.nextInt();
		
		m = ((double)(y2 - y1)) / ((double)(x2-x1));
		b = (-x1 * m) - (-y1);
		
		System.out.printf("Your line is y = %3.2f x + %3.2f", m, b);
		
		in.close();
	}
}
