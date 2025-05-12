package Udemy.Java.Basics;

import java.util.ArrayList;

public class Iterate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array 
		//Array List
		
		int[] arr2=  {1,2,3,4,5,6,7,8,9};
		
		for (int i=0;i<arr2.length;i++) 
		
		{ 
			
			if(arr2[i]%2==0) {
				
				System.out.println(arr2[i]);
				
				break;
				
		}

			else 
				{
					System.out.println(arr2[i]+ "is not multiple of 2");
				
				}}
		
		ArrayList<String> text = new ArrayList<String>();
		text.add("Text1");
		text.add("Text2");
		text.add("Text3");
		System.out.println(text.get(2)); 
		
		System.out.println("=================");
		
		for(int i=0; i<text.size(); i++) {
			
			System.out.println(text.get(i));
			}
		System.out.println("*************");
		
		//enhanced for loop
		for(String val :text) {
			
			System.out.println(val);
			
		}
		
                 
}}