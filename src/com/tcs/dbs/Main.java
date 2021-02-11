package com.tcs.dbs;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Customer> database=new HashMap<Integer,Customer>();
		database.put(9010,new Customer(100, 9010, "pass1", "secunderabad","Ronaldo"));
		database.put(9603,new Customer(200, 9603, "pass2", "shamirpet","Messi"));
		System.out.println("WELCOME TO DBS BANK");
		do {
			System.out.print("Enter username:");
			int username=sc.nextInt();
			System.out.print("Enter password:");
			String password=sc.next();
			
			if(!database.containsKey(username) || !database.get(username).password.equals(password))
			{
				System.out.println("INVALID username/password,please insert card again");
				break;
			}
			else
			{
				System.out.println("HELLO "+database.get(username).name);
				Helper.displayOptions();
				int option=sc.nextInt();
				Helper.performOperations(username, password, database, option);
				break;
			}
			
		}while(true);
		sc.close();
	}
}
