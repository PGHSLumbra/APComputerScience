import java.util.Scanner;

public class three_one_four {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What x: ");
		int x = in.nextInt();
		
		findDanPower(x);
		in.close();
	}
	public static void findDanPower(int n) {
		int value = 1;
		for(int i = 0; i< 11; i++) {
			System.out.print(value + " ");
			value = value * n;
		}
	}
}
