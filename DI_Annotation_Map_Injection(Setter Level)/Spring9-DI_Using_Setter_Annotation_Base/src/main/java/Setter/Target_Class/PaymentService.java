package Setter.Target_Class;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Setter.Dependant_Class.Payment;

@Component
public class PaymentService 
{
	Map<String,Payment> ps;
	
	@Autowired
	public void setPayment(Map<String,Payment> ps)
	{
		this.ps=ps;
	}
	
	public void operation(String paymentType,int amount)
	{
		Payment p=ps.get(paymentType);
		if(ps==null)
		{
			System.out.println("Please Enter correct type...");
		}
		else
		{
			p.pay(amount);
		}
		
	}

}
