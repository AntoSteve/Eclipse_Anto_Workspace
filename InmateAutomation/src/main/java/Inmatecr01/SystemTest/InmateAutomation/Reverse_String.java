package Inmatecr01.SystemTest.InmateAutomation;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Antosteve";
		
		char[] array = str.toCharArray();
		
		for(int i= array.length-1; i>=0; i--) {
			
			System.out.println(array[i]);
		}
	}

}
