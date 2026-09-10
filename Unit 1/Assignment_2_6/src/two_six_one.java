import java.util.Scanner;

public class two_six_one {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your minimum value? ");
		int min = in.nextInt();
		System.out.println("What is your maximum value? ");
		int max = in.nextInt();
		
		int x = min;
		System.out.print(" ");
		while (max >= x) {
			System.out.printf("%4d", x);
			x++;
		}
		for (int i = min; i <= max; i++) {
			System.out.printf("\n%d", i);
			for(int j = min; j <= max; j++) {
				System.out.printf("%4d", j * i);
			}

		}
		
		in.close();
	}
}
