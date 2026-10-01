import java.util.Scanner;

public class three_one_two {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is the string: ");
		String s = in.nextLine();		
		System.out.print("What is the int: ");
		int x = in.nextInt();

		printing(s, x);
		in.close();
	}
	public static void printing(String e, int h) {
		for (int i = 0; i < h; i++){
			System.out.print(e + " ");
		}
	}
	
}
