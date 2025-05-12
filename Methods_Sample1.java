package Udemy.Java.Basics;

public class Methods_Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods_Sample1 a = new Methods_Sample1();
		String name =a.getData();
		System.out.println(name);
		Methods_Sample2 b = new Methods_Sample2();
		b.getUserData123();
		String c = checkdata();
		System.out.println(c);
		

	}
    
	public String getData() {
		System.out.println("Test Print Check");
		return "testing";
	}
	
	public static String checkdata() {
		System.out.println("checkdata");
		return "checkdata2";
	}
}
