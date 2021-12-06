import java.util.Scanner;

public class FindNumberOfDays {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select starting day");
		int today = sc.nextInt();
		System.out.println("Input how many days after");
		int after_how = sc.nextInt();
		
		int days = (today + after_how) % 7;
		
		System.out.println(days);
	}

}
