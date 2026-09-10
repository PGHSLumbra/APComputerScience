import java.util.Scanner;

public class two_five_one {
	public static void main(String[] args) {
		int num;
		num = 0;
		
		for (int x = 0; x <= 100; x+= 2) {
			num += x;
		}
		
		System.out.println(num);
		
		num = 0;
		
		for (int x = 0; x <= 10; x++) {
			num += (x * x);
		}
		System.out.println(num);
		
		num = 1;
		for (int x = 0;  x<= 20; x++) {
			System.out.print(num + " ");
			num *= 2;
		}
		
		num = 0;
		
		for (int x = 0; x <= 10; x++) {
			
		}
		

		
		
		Scanner in = new Scanner(System.in);
		System.out.println("\nEnter a int: ");
		num = in.nextInt();
		int x = 0;
		while(num > 0) {
			if ((num % 10) % 2 == 1) {
				x += num % 10;
			}
			num = num / 10;
		}
		System.out.print(x);

		in.close();
	}
}
