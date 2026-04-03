package com.DI;

public class CardPayment implements Payment
{
	//Dependant class
	public void pay(int a)
	{
		System.out.println("Pay Rs."+a+"\nPayment Successfully...");
	}

}
