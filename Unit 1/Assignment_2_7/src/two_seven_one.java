import java.util.Scanner;

public class two_seven_one {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer to see if its prime: ");
		int num = in.nextInt();
		
		int x = 0;
			for(int i = 1; i <= num; i++){
				if(num % i == 0) {
					System.out.printf(i + " ");
					x++;
				}
			}
		if ((x == 2) || (num == 1)) {
			System.out.println("\nYour number is Prime!");
		}
			
		in.close();
	}
}
