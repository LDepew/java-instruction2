
public class GetBits {
	
	public static void main (String [] args) {
		
		int x = 182;
		int p = 4;
		int n = 3;
		
		int x2 = x >> (p + 1 - n) & ~(~0 << n);
		
		System.out.println("After getbits x = " + x2);
	}

}
