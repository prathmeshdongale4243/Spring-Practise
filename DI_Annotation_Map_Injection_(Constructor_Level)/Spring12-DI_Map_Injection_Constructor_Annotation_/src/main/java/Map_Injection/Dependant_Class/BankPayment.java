package Map_Injection.Dependant_Class;

import org.springframework.stereotype.Component;

@Component("bank")
public class BankPayment implements Payment
{
	public void pay(int amount)
	{
		System.out.println("Payment Using Bank ....");
		System.out.println("Amount Rs :- "+amount);
		System.out.println("Payment Successfully....");
	}

}
