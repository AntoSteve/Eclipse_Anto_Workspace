package Inmatecr01.SystemTest.InmateAutomation;



public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = "Antosteve";
	
/*	String part1= str.substring(0,4);
	
	String part2 = str.substring(4);
	
	System.out.println(part1);
	
	System.out.println(part2);  */
	
	
	char[] charr = str.toCharArray();
	
	for(int i = charr.length-1; i>=0; i--) {
		
		System.out.println(charr[i]);
	}
	
	
	
	
	
		}
		
	}

