
public class Time {
	public static void main(String[] args) {
		
		int hours = 14;
		int minutes = 21;
		int seconds =  0;
		
		int since_mid = (((hours * 60) + minutes) * 60) + seconds;
		int day = (((24 * 60) + minutes) * 60) + seconds;
		
		System.out.println(since_mid + " seconds past today.");
		System.out.println(day - since_mid + " second left today.");
		
		double d_since_mid = since_mid;
		double d_day = day; 
		double percent = (d_since_mid / d_day) * 100;
		
		System.out.format("%.2f", percent);
		System.out.println("% of the day has pasted.");
		
		int new_hours = 14;
		int new_minutes = 51;
		int new_seconds =  0;
		int new_time = (((new_hours * 60) + new_minutes) * 60) + new_seconds;
		
		System.out.println(new_time - since_mid + " seconds have pasted.");
	}
}
