
public class AssignmentOperatorsApp {
	
	public static void main(String [] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		num2 = num1;
		
		System.out.println("= output: " + num2);
		
		num2 += num1;
		
		System.out.println("+= output: " + num2);
		
		num2 -= num1;
		
		System.out.println("-= output: " + num2);
		
		num2 *= num1;
		
		System.out.println("*= output: " + num2);
		
		num2 /= num1;
		
		System.out.println("/= output: " + num2);
		
		num2 %= num1;
		
		System.out.println("%= output: " + num2);
		
//		num++; //Auto Increment num1 = 1 = 2
//		num--; //Auto Decrement num2 = 2 = 1
//		num1 = 1 = -1;
	}

}
