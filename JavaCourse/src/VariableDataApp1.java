
public class VariableDataApp1 {
//	static data_type variable_name;
	
	static int count = 0;
	public void increment() {
		count ++;
	}
	
	public static void main(String[] args) {
		
		VariableDataApp1 obj1 = new VariableDataApp1();
		VariableDataApp1 obj2 = new VariableDataApp1();
		obj1.increment();
		obj2.increment();
		
		System.out.println("Obj1: count is = " + obj1.count);
		System.out.println("Obj2: count is = " + obj2.count);
	}
	
//	data_type variable_name = value;
//	char ch = 'A';
//	int bigNumber = 100;
//	int num$ = 100;
//	
//	
//	
//	bigNumber 
}
