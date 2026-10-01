
public class three_one_one {
	public static void main(String[] args) {
		findSum(1, 3);
		findSum(3, 5);
		findSum(-7, 15);
		
	}
	public static void findSum(int x, int y) {
		int z = x + y;
		System.out.printf("%,d plus %,d equals %,d\n", x, y, z);
	}
}
