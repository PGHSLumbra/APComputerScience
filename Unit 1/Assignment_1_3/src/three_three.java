import java.util.Scanner;

public class three_three {
	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);

			
		System.out.print("Enter a number of seconds: ");
		number = in.nextInt();
		
		int hours = number / 3600;
		int sec_minutes = number % 3600;
		int minutes = sec_minutes / 60;
		int seconds = sec_minutes % 60;
		
		System.out.printf("%,d seconds = %,d hours, %,d minutes, and %,d seconds", number, hours, minutes, seconds);
		
		in.close();
	}
}
