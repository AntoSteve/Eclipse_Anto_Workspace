
public class Interest {
	int InterestRate;
	float amount;
	
	float permonthInterest;
	
	public void getInterest() {
		permonthInterest = amount * InterestRate /100;
		
		System.out.println("Amount of month interest"  + permonthInterest );
	}

}
