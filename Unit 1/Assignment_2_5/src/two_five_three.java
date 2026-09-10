import java.util.Scanner;

public class two_five_three {
	 public static void main(String[] args) {
		int a;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a = in.nextInt();
		 
		double x0 = 0;
		double x1 = a / 2;
		while (Math.abs(x0 - x1) > 0.0001) {
			x0 = x1;
			x1 = ((x0 + (a / x0)) / 2);
		}
		System.out.printf("%,f", x1);
		in.close();
	 }
}
