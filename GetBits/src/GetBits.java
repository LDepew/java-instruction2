import java.util.Scanner;

public class GetBits {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x value");
		int x = sc.nextInt();
		System.out.println("Enter p value");
		int p = sc.nextInt();
		System.out.println("Enter n value");
		int n = sc.nextInt();
		
		int x2 = x >> (p + 1 - n) & ~(~0 << n);
		
		System.out.println("After getbits x = " + x2);
		
	}

}
