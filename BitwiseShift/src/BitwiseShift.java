
public class BitwiseShift {
	
	public static void main (String[]args) {
		
		int val = 1;
		System.out.println("1 looks like below");
		ShowBits(val);
		
		val = val >> 1;
		val = val >> 1;
		val = val >> 1;
		val = val >> 1;
		val = val >> 1;
		
		System.out.println();
		System.out.println("1 after shifting 5 time looks like below");;
		
		ShowBits(val);
		System.out.println();
		
		val = -1;
		System.out.println("-1 looks like below");
		ShowBits(-1);
		
		val = val >> 1;
		val = val >> 1;
		val = val >> 1;
		val = val >> 1;
		val = val >> 1;
		
		System.out.println("-1 after shifting 5 times looks like below");
		ShowBits(val);
		
		System.out.println();
		val = -1;
		
		System.out.println("-1 looks like below");
		ShowBits(-1);
		val = val >>> 1;
		val = val >>> 1;
		val = val >>> 1;
		val = val >>> 1;
		val = val >>> 1;
		
		System.out.println("-1 after shiting 5 times using >>> looks like below");
		ShowBits(val);
		
	}
	public static void ShowBits( int val ) {
		int mask = 1 << ((Integer.BYTES) * 8) - 1;
		
		for( int i=0; i < ((Integer.BYTES) * 8); i++) {
			if ( (val & mask) != 0) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
			val <<= 1;
		}
		System.out.println();	
	}

}
