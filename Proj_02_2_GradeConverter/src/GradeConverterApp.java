import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		
		String choice = "Y";
		
		while (choice.equalsIgnoreCase("Y")) {
		
		System.out.print("Enter numerical grade: ");
		int numGrade = sc.nextInt();
		
		String letterGrade = null;
		
		if (numGrade >= 88 && numGrade <= 100) {
			letterGrade = "A";
		}
		else if (numGrade >= 80 && numGrade <= 87) {
			letterGrade = "B";
		}
		else if (numGrade >= 68 && numGrade <= 79) {
			 letterGrade = "C";
		}
		else if (numGrade >= 60 && numGrade <= 67) {
			 letterGrade = "D";
		}
		else if (numGrade < 60) {
			letterGrade = "F";
		}

		System.out.println("Letter Grade: " + letterGrade);
		System.out.println();
		System.out.print("Continue y/n?");
		choice = sc.next();
	}
		
		System.out.println("bye");
	}
	
	


}
