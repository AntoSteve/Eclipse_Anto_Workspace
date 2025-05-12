
public class Test {

	public static void main(String[] args) {
		
		test1 obj = new test1();
		obj.a=29;
		obj.b=30;
		obj.add();
		
		TestStatic.a=20;
		TestStatic.b=12;
		int e= TestStatic.sub();
		
		System.out.println(e);
		
		
	}

}
