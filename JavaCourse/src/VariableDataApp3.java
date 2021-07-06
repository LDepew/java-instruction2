
public class VariableDataApp3 {
	public String myVar = "Instance Variable";
	public void myMethod() {
		String myVar = "Inside Method";
		System.out.println(myVar);
	}

	public static void main(String [] args) {
		VariableDataApp3 obj = new VariableDataApp3();
		System.out.println("Calling Method");
		obj.myMethod();
		System.out.println(obj.myVar);
		
	}
}
