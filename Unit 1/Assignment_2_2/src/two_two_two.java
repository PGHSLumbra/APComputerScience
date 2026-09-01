import java.util.Scanner;

public class two_two_two {
	public static void main(String[] args) {
		int year;
		Scanner in = new Scanner(System.in);

			
		System.out.print("Enter a year: ");
		year = in.nextInt();

		if (((year != 0) && (year % 4 == 0)) && ((year % 100 == 0) && (year % 400 == 0))) {
			if ((year % 100 == 0) || (year % 400 == 0)) {
				System.out.println("That year is a leap year.");
			}
		} else {
			System.out.println("That year is not a leap year");
		}
		
		in.close();
	}
}
