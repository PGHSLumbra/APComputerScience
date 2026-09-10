import java.util.Scanner;

public class two_four_one {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is your favorite flavor of ice cream (enter the number)?\n"
				+ "1. Vanilla\n"
				+ "2. Strawberry\n"
				+ "3. Chocolate\n"
				+ "4. Cookies and Cream\n"
				+ "5. Rocky Road\n"
				+ "6. Mint Chocolate Chip\n"
				+ "7. Birthday Cake\n");
		int ice_cream = in.nextInt();
		

		switch (ice_cream)  {
			case 1:  System.out.println("Vanilla: A bit boring, but you appreciate the simpler things in life. \nYou’re not afraid of what others think, and you’ll stand by your \nprinciples.");  
				break;
			case 2:  System.out.println("Strawberry: Fruity, you deffinatly drive a prius. You also do MMA Fighting. ");  
				break;
			case 3:  System.out.println("Chocolate: A great choice, fan favorite. You get the cashiers personal \napproval.");  
				break;
			case 4: System.out.println("Cookies and Cream: You like some variety in your like, you dont want to \nbe basic but you like to change things up sometimes.");
				break;
			case 5: System.out.println("Rocky Road: Hard path for a hard person. You really want to get strawberry \nbut dont want your friend to think otherwise.");
				break;
			case 6: System.out.println("Mint Chocolate Chip: So you like eating bitter crap do you.\nIce cream is supposed to be sweet not taste like you eat toothpaste.\nWell, if you like this flavor you probably do anyways.");
				break;
			case 7: System.out.println("Birthday Cake: I mean its not vanilla, so thats something.");
				break;
			default:  System.out.println("Invalid Flavor");
			
		}

		in.close();
	}
}
