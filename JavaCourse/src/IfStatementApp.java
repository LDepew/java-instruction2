import java.util.Scanner;

public class IfStatementApp {
	
	public static void main(String [] args) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter age: ");
		
		age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("Above 18");
		}
		
	}

}
