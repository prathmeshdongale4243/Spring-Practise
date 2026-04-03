package com.DI;

public class PaymentService
{
	//Target Class
	
	Payment p;
	PaymentService(Payment p)
	{
		this.p=p;
	}

	public void operation(int amount)
	{
		p.pay(amount);
	}
}
