import java.util.Scanner;

public class three_two_one {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is n: ");
		int n = in.nextInt();
		System.out.print("What is m: " );
		int m = in.nextInt();
		
		isDivisible(n, m);	
		in.close();
	}
	public static void isDivisible(int x, int y) {
		System.out.print(x % y == 0);
	}
}
