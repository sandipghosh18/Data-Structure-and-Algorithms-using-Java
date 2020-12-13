package LinkedList;

import java.util.HashMap;

public class hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Number> phonenumber=new HashMap<String,Number>();
		
		phonenumber.put("Sandip", 779721);
		phonenumber.put("Aditi", 9867885);
		phonenumber.put("Cp", 88676544);
		phonenumber.put("Rakesh", 7267885);
		phonenumber.put("Manu", 8554324);
		phonenumber.put("Anirban", 5896333);
		
		//Display of HashMap
		System.out.println(phonenumber);
		
		//for display of only keys
		System.out.println("\nThe keys are :");
		for(String i: phonenumber.keySet())
		{
			System.out.println(i);
		}
		
		//for display of only values
		System.out.print("\nThe values are: \n");
		for(Number i:phonenumber.values())
		{
			System.out.println(i);
		}
		
		
		//for display of particular key--->value
		int x=(int)phonenumber.get("Aditi");
		System.out.println("\nPhone number of aditi is:"+x);
		
		//Entryset
		System.out.println("\n"+phonenumber.entrySet());

	}

}
