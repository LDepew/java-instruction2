
public class SingleDimanArrayApp {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 50;
		a[4] = 100;
		
		for(int i=0; i<a.length; i++) { 
			System.out.println(a[i]);
	}
		
		System.out.println();
		
		int iarr[] = new int[3];
		
		iarr[0] = 1;
		iarr[1] = 2;
		iarr[2] = 3;
		
		System.out.println(iarr[0]);
		System.out.println(iarr[1]);
		System.out.println(iarr[2]);
		System.out.println();

		for (int i = 0; i<iarr.length; i=i+1) {
			System.out.println(iarr[i]);
			System.out.println("");
		}
	}

}
