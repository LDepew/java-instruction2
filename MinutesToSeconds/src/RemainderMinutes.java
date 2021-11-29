import java.util.Scanner;

public class RemainderMinutes {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the time in Seconds ");
		int seconds = sc.nextInt();
		
		int minutes = seconds / 60;
		
		int rem_seconds = seconds % 60;
		
		System.out.println("Minutes = " + minutes);
		System.out.println("Remaining Seconds = " + rem_seconds);
	}

}
