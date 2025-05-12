package Udemy.Java.Basics;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] testarray = new int[6];
		testarray[0] = 1;
		testarray[1] = 2;
		testarray[2] = 3;
		testarray[3] = 4;
		testarray[4] = 5;
		testarray[5] = 6;
		
		
		int[]  testarray2 = {1,2,3,4,5,6};
		
		for(int i=0; i<testarray.length; i++) {
			
			System.out.println(testarray[i]);
		}
		
		String[]  name = {"test1","test2","test3"};
		
		for(int i=0; i<name.length; i++)
		{
		  
		System.out.println(name[i]);
		}
		
		for(String s:name);
		
		}
	  
	

}
