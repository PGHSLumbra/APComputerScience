import java.util.Scanner;

public class four_one {
	public static void main(String[] args) {
		int teaspoons;
		Scanner in = new Scanner(System.in);

			
		System.out.print("How many teaspoons are there? ");
		teaspoons = in.nextInt();
		
		int gallon = teaspoons / 768;
		int ref_quart = teaspoons % 768;
		int quart =  ref_quart / 192;
		int ref_cup = ref_quart % 192;
		int cup = ref_cup / 48;
		int ref_table = ref_cup % 48;
		int table = ref_table / 3;
		int teaspoon = ref_table % 3;
		
		System.out.printf("You have %,d gallons, %,d quarts, %,d cups, %,d tablespoons, and %,d teaspoons.", gallon, quart, cup, table, teaspoon);
		
		in.close();
	}
}
