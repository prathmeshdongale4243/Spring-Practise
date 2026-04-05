package Map_Injection.Dependant_Class;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPayment implements Payment
{
	public void pay(int amount)
	{
		System.out.println("Payment Using UPI ....");
		System.out.println("Amount Rs :- "+amount);
		System.out.println("Payment Successfully....");
	}
	
	

}
