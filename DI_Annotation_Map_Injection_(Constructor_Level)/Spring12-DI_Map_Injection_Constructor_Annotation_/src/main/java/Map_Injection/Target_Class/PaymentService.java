package Map_Injection.Target_Class;

import org.springframework.stereotype.Component;
import Map_Injection.Dependant_Class.*;
import java.util.*;
@Component
public class PaymentService 
{
	Map<String,Payment> ps;
	public PaymentService(Map<String,Payment> ps)
	{
		this.ps=ps;
	}
	
	public void placeOrder(String paymentType,int amount)
	{
		Payment p=ps.get(paymentType);
		if(p==null)
		{
			System.out.println("Please Enter Valid type....");
		}
		else
		{
			p.pay(amount);
		}
	}
	

}
