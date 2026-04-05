package Map_Injection.Dependant_Class;

import org.springframework.stereotype.Component;

@Component("card")
public class CardPayment implements Payment
{
	public void pay(int amount)
	{
		System.out.println("Payment Using Card ....");
		System.out.println("Amount Rs :- "+amount);
		System.out.println("Payment Successfully....");
	}

}
