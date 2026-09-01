import java.util.Scanner;

public class two_one_one {
	public static void main(String[] args) {
		int even_odd;
		Scanner in = new Scanner(System.in);

		System.out.print("Give me a whole number: ");
		even_odd = in.nextInt();
		System.out.printf("%,d is ", even_odd);
		
		if (even_odd % 2 == 0) {
			System.out.print("Even.");
		} else {
			System.out.print("Odd.");
		}
			
		in.close();
	}

}
