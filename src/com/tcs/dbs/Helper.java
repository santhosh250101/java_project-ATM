package com.tcs.dbs;
import java.util.*;
public class Helper {
	public static void performOperations(int username,String password,HashMap<Integer,Customer> database,int option)
	{
		
		Scanner sc=new Scanner(System.in);
		if(option==1)
		{
			System.out.println("Total balance:"+database.get(username).balance);
			System.out.println("-----------------------Thanq----------------------");
		}
		else if(option==2)
		{
			System.out.println("Enter Amount to be deposited");
			int depo=sc.nextInt();
			System.out.println("Balance before deposit "+database.get(username).balance);
			database.get(username).balance+=depo;
			System.out.println("Balance before deposit "+database.get(username).balance);
			System.out.println("deposited Sucessfully");
			System.out.println("-----------------------Thanq----------------------");
		}
		else if(option==3)
		{
			System.out.println(database.get(username).toString());
			System.out.println("-----------------------Thanq----------------------");
		}
		else
		{
			System.out.println("-----------------------Thanq----------------------");
		}
		sc.close();
	}
	public static void displayOptions()
	{
		System.out.println("Select the following options to serve better");
		System.out.println("press 1 to check balance");
		System.out.println("press 2 to deposit money");
		System.out.println("press 3 display details");
		System.out.println("press 4 to exit");
	}
}
