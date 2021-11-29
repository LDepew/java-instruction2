
public class BitwiseReplaceArithmetic {
	
	public static void main (String [] args) {
		
		int i = 2;
		int j = 4;
		
		int res = (i * 8) + (j / 4);
		System.out.println("Arithmetic (i * 8) + (j / 4) = " + res);
		
		int res2 = (i << 3) + (j >> 2);
		System.out.println("Bitwise (i << 3) + (j >> 2) = " + res2);
	}

}
