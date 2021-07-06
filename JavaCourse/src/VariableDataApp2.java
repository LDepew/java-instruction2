
public class VariableDataApp2 {
	String myInstanceVar = "Instance Variable";
	public static void main(String [] args) {
		
		VariableDataApp2 obj = new VariableDataApp2();
		VariableDataApp2 obj2 = new VariableDataApp2();
		VariableDataApp2 obj3 = new VariableDataApp2();
		
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
		
		obj2.myInstanceVar = "Changed Text";
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
	}
}
