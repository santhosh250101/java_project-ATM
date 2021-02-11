package com.tcs.dbs;

public class Customer {
	int balance;
	int username;
	String password;
	String branch;
	String name;
	Customer(int balance,int username,String password,String branch,String name)
	{
		this.password=password;
		this.username=username;
		this.balance=balance;
		this.branch=branch;
		this.name=name;
	}
	@Override
	public String toString()
	{
		return " name:"+name+" balance:"+balance+" branch:"+branch;
	}
}
