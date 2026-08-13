import java.util.Scanner;

public class three_four {
	public static void main(String[] args) {
		int rand_num = (int) (100 * Math.random() + 1);	
		int guess;
		Scanner in = new Scanner(System.in);

			
		System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		guess = in.nextInt();
		int off = Math.abs(rand_num - guess);
		
		System.out.printf("The number I was thinking of is: %,d \nYou where off by: %,d", rand_num, off);
		
		in.close();
	}
}
