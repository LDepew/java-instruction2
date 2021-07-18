
public class CharacterFromStringApp {
	
	public static void main(String [] args) {
		
		String favoriteMeal = "I really love good pasta.";
		String favoriteDrink = "I love to drink ice tea.";
		char jason;
		
		System.out.println(favoriteMeal);
		System.out.println(favoriteDrink);
		System.out.println();
		
		System.out.println(favoriteMeal.charAt(10));
		System.out.println(favoriteDrink.charAt(0));
		System.out.println();
		
		for(int i = 0; i <= favoriteDrink.length()-1; i++) {
			System.out.println(favoriteDrink.charAt(i));
	}
		
		System.out.println();
		
		jason = favoriteMeal.charAt(2);
		System.out.println(jason);

}
	
}
