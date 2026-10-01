import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class three_two_three {
	public static void main(String [] args)throws IOException {
		Scanner inFile = new Scanner(new File("Resistance.txt"));
		

		for (int i = 0; i < 6; i++) {
			double x = inFile.nextDouble();
			double y = inFile.nextDouble();
			double z = inFile.nextDouble();

			System.out.printf("Circuit: Total resistance is %,f ohms.\n", resistance(x, y, z));
		}
		inFile.close();
	}
	public static double resistance(double r_1, double r_2, double r_3) {
		double r_4 = Math.pow((1 / r_1) + (1 / r_2), -1);
		double r_t = r_4 + r_3;
		return r_t;
		
	}
}
