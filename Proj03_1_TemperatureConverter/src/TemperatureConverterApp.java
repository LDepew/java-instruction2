import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		
		String choice = "Y";
		
		while (choice.equalsIgnoreCase("Y")) {
		
		System.out.print("Enter degrees in Fahrenheit: ");
		double fahren = sc.nextDouble();
		
		DecimalFormat df = new DecimalFormat(".00");
		
		System.out.println("Degrees in Celsius: " + df.format((fahren - 32) * 5/9));
		System.out.println();
		
		System.out.print("Continue y/n?: ");
		choice = sc.next();

		}
		
		System.out.println("Bye");

	}

}
