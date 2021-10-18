import java.util.Scanner;

public class MakeChocolateApp {

	public static int main(int small, int big, int goal) {
		

			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Please input desired amount of chocolate in kilos: ");
			goal = sc.nextInt();
			
			while (big > 0 && goal >= 5) {
				big --;
				goal -= 5;
			}
			
			if (goal <= small)
				return goal;
			else return -1;
			
			
			
		}

	}

