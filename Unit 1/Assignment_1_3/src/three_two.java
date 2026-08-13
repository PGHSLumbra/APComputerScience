import java.util.Scanner;

public class three_two {
	public static void main(String[] args) {
		double number;
		Scanner in = new Scanner(System.in);
			
		System.out.print("Enter a temperature in Celcius:");
		number = in.nextDouble();
		
		double fahrenheit = number * ((double) 9/ (double) 5) + 32;		
		
		System.out.printf("%.1f C = %.1f F", number, fahrenheit);
		in.close();
	}
}
