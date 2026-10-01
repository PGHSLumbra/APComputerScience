import java.util.Scanner;
public class three_one_three {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = in.nextInt();
		System.out.print("Enter b:");
		int b = in.nextInt();
		System.out.print("Enter c:");
		int c = in.nextInt();
		
		triangleType(a, b, c);
		
		in.close();
	}
	public static void triangleType(int num_1, int num_2, int num_3) {
		if (num_1 == num_2 && num_2 == num_3) {
			System.out.print("The triangle is Equialateral");
		} else if (num_1 == num_2 || num_2 == num_3 || num_3 == num_1) {
			System.out.print("The triangle is Isosceles");
		} else {
			System.out.print("The triangle is Scalene");
		}
	}
	
}
