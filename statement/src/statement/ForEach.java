package statement;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraymarks[]= {50,60,70,80};
		float arraymark1[] = {100.50f, 200.5f, 300.5f, 400.50f};
		String arrayName[]= {"mark1","mark2","mark3","mark4"};
		char charname[] = {'1','2','3','4'};
		
		System.out.println("*****************");
		for(int a:arraymarks) {
			System.out.println(a);
		}
		System.out.println("*****************");
		for(float b:arraymark1) {
			System.out.println(b);
		} 
		System.out.println("*****************");
		for(String c:arrayName) {
			System.out.println(c);
		} 
		System.out.println("*****************");
		for(char d:charname) {
			System.out.println(d);
		} 
	}

}
