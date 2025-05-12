package statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*************");
		System.out.println("Operations");
		System.out.println("************");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Mul");
		System.out.println("Enter your choice:");
		//String  choice = br.readLine();
		int choice = Integer.parseInt(br.readLine());

		switch (choice) {

		case 1:
			System.out.println("Enter the first number");
			int fno1 = Integer.parseInt(br.readLine());
			System.out.println("Enter the second number");
			int sno1= Integer.parseInt(br.readLine());
			Add obj1 = new Add();
			obj1.a= fno1;
			obj1.b= sno1;
			obj1.add();
			break;

		case 2:
			System.out.println("Enter the first number");
			int fno2 = Integer.parseInt(br.readLine());
			System.out.println("Enter the second number");
			int sno2= Integer.parseInt(br.readLine());
			Sub obj2 = new Sub();
			obj2.a= fno2;
			obj2.b= sno2;
			obj2.sub();
			break;

		case 3:
			System.out.println("Enter the first number");
			int fno3 = Integer.parseInt(br.readLine());
			System.out.println("Enter the second number");
			int sno3= Integer.parseInt(br.readLine());
			Mul obj3 = new Mul();
			obj3.a= fno3;
			obj3.b= sno3;
			obj3.mul();;
			break;

		default:
			System.out.println("Enter correct number");
			break;

		}

	}

}
