import java.util.*;
import java.text.*;

public class DateFormattingApp {
	
	public static void main(String [] args) {
	
		Date dNow = new Date();
		
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.mm.dd 'at' hhhh:mm:ss a zzz");
		
		System.out.println("Current Date : " + ft.format(dNow));
		
		

	}

}
