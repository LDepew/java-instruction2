
public class SetBits {
	
	static int setKthBit(int n, int k)
	{
		return ((1 <<k) | n);
	}
	
	public static void main (String [] args) {
		
		int n = 10, k = 2;
		System.out.println("Kth bit set number = " +
								setKthBit(n, k));
		
	}
	

}
