package Map_Injection;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Map_Injection.Target_Class.PaymentService;

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new AnnotationConfigApplicationContext(RamConfig.class);
		PaymentService p1=context.getBean(PaymentService.class);
		System.out.println("Enter a Payment Type ....\n1.upi  \n2.card  \n3.bank");
		String ch=sc.nextLine();
		
		System.out.println("Enter a Amount for pay ....");
		int amount=sc.nextInt();
		p1.placeOrder(ch, amount);
		
		
	}

}
