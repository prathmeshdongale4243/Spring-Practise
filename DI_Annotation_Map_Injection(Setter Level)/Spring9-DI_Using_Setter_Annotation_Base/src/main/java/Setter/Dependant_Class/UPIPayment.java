package Setter.Dependant_Class;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPayment implements Payment
{
	public void pay(int amount)
	{
		System.out.println("Paymeny through UPI Payment...");	
		System.out.println("Payment Rs. "+amount);
		System.out.println("Payment Successfully");
	}

}
