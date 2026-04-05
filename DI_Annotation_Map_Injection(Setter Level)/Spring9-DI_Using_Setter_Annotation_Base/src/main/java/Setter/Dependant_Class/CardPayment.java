package Setter.Dependant_Class;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("card")  
public class CardPayment implements Payment
{
	public void pay(int amount)
	{
		System.out.println("Paymeny through Card Payment...");	
		System.out.println("Payment Rs. "+amount);
		System.out.println("Payment Successfully");
	}

}
