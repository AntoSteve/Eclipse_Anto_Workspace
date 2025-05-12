import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {

	public static void main(String[] args) throws IOException {
		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(isr);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("*************************************");
		System.out.println("********** Registration Form *************");
		System.out.println("************************************");

		System.out.println("Enter your name :");
		String name = br.readLine();

		System.out.println("Enter your age:");
		int age = Integer.parseInt(br.readLine());
		
		 //skip the enter 

		System.out.println("Enter your nationality:");
		String natioanality = br.readLine();

		System.out.println("Enter your gender(m/f):");
		char gender = (char) br.read(); //m/n
		br.skip(2);
		

		System.out.println("******************************");
		System.out.println("****** Person Details *********");
		System.out.println("******************************");

		System.out.println("Your name:" + name);
		System.out.println("your age:" + age);
		System.out.println("your gender:" + gender);
		System.out.println("your nationality:" + natioanality);

	}
}
