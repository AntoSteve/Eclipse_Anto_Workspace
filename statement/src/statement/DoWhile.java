package statement;

public class DoWhile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int a=1;
		do {
			Thread.sleep(1000);
			
			System.out.println("*******the value of a**********:"+ a);
			a++;
			
		}while(a<10);

	}

}
