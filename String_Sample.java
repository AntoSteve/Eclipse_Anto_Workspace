package Udemy.Java.Basics;

public class String_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
          String s1 = "Test String";
          System.out.println(s1);
		
          String s2 = new String("Testing Test");
          System.out.println(s2);
          
          String s3 = "Sample Test Checking Tester";
          String[] splitString = s3.split("Test");
          System.out.println(splitString[0]);
          System.out.println(splitString[1]);
          System.out.println(splitString[1].trim());
          for(int i=s3.length()-1; i>=0;i--) {
        	  
        	  System.out.println(s3.charAt(i));
        	  //System.out.println(i);
          
	}

}
}