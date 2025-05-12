import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfStatement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter your mark :");
		int mark = Integer.parseInt(br.readLine());
		
		if(mark >90 && mark<=100) {
			System.out.println("grade one");
			System.out.println("pass");
			}
		
		else if (mark >80 && mark<= 90){
			System.out.println("grade two");
			System.out.println("pass");
			
		}
		
		else if(mark > 70 && mark <= 80 ) {
			System.out.println("grade three");
			System.out.println("pass");
		}
		else if(mark > 60 && mark <=70  ) {
			System.out.println("grade four");
			System.out.println("pass");
		}
		
		else {
			System.out.println("sorry");
			System.out.println("fail");
			
		}
		}
		
		
	}

