import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		
		String choice = "Y";
		
		while (choice.equalsIgnoreCase("Y")) {
		
		System.out.print("Enter length: ");
		double length = sc.nextDouble();
		System.out.print("Enter width: ");
		double width = sc.nextDouble();
		System.out.println();
		
		System.out.println("Area: " + (width * length));
		System.out.println("Perimeter: " + ((2 * width) + (2 * length)));
		
		System.out.print("Continue y/n?: ");
		choice = sc.next();
		System.out.println();
		
		}
		
		System.out.println("Bye");

	}

}
