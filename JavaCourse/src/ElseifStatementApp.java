import java.util.Scanner;

public class ElseifStatementApp {
	
	public static void main(String [] args) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your age:");
		
		age = sc.nextInt();
		
		if(age >= 18 && age <= 38) {
			System.out.println("Between 18 - 38");
		}
		
		else if(age > 38 && age <= 60) {
			System.out.println("Between 38 - 60");
		}
		else {
			System.out.println("Not Matched");
		}
		
	}

}
