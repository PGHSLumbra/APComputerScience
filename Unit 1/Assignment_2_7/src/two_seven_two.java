import java.util.Scanner;

public class two_seven_two {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a integer (1 → 20)");
		int num = in.nextInt();
		
		int x = 0;
		
		
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			x++;
			System.out.print('\n');
		}
		
		in.close();
	}
}
