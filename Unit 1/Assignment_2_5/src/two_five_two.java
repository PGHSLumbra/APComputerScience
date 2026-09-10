import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class two_five_two {

	public static void main(String[] args)throws IOException  {
		
		Scanner inFile = new Scanner(new File("two_five_two.txt"));
		
		double number = inFile.nextDouble();
		int x = 1;
		double ave = number;
		double minimum = number;
		double maximum = number;
		
		while (inFile.hasNext()) {
			number = inFile.nextDouble();
			
			//Mean 
			ave += number;
			x++;
			
			//Minimum
			if (number < minimum) {
				minimum = number;
			}
			if (number > maximum) {
				maximum = number;
			}
		}
		
		System.out.printf("Mean = %.2f", ave / x);
		System.out.printf("\nMinimum =  %.2f", minimum);
		System.out.printf("\nMaximum = %.2f", maximum);
		
		inFile.close();
	}

}
