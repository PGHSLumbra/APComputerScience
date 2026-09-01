import java.util.Scanner;
public class two_two_one {
	public static void main(String[] args) {
		int first_Num;
		int second_Num;
		int quotiant;
		int remainder;
		int big_Num;
		int small_Num;
		Scanner in = new Scanner(System.in);

		System.out.print("What is your first number? ");
		first_Num = in.nextInt();
		System.out.print("What is your second number? ");
		second_Num = in.nextInt();
		
		if ((first_Num > second_Num) && (second_Num != 0)) {
			big_Num = first_Num;
			small_Num = second_Num;
			
			quotiant = first_Num / second_Num;
			remainder = first_Num % second_Num;
			
			System.out.printf("%,d//%,d = %,d r %,d", big_Num, small_Num, quotiant, remainder);
		} else if ((second_Num > first_Num) && (first_Num !=0)) {
			big_Num = second_Num;
			small_Num = first_Num;
			
			quotiant = second_Num / first_Num;
			remainder = second_Num % first_Num;
			
			System.out.printf("%,d/%,d = %,d r %,d", big_Num, small_Num, quotiant, remainder);
		} else if ((first_Num == second_Num) && (first_Num != 0)) {
			big_Num = first_Num;
			small_Num = second_Num;
			
			quotiant = 1;
			remainder = 0;

			System.out.printf("%,d//%,d = %,d r %,d", big_Num, small_Num, quotiant, remainder);
		} else {
			System.out.print("Error: You didnt use numbers or divided by zero.");
		}
		
		in.close();
	}
}
