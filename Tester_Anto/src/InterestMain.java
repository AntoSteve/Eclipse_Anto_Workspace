import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterestMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
     
		
		Interest obj1 = new Interest();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your amount");
		float amt = Float.parseFloat(br.readLine());
		obj1.amount=1000.500f;
		obj1.InterestRate=2;
		obj1.getInterest();
		
		
	}

}
