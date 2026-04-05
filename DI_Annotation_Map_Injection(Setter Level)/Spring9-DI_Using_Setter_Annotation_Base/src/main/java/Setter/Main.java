package Setter;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Setter.Target_Class.PaymentService;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new AnnotationConfigApplicationContext(RamConfig.class);
		PaymentService p1=context.getBean(PaymentService.class);
		System.out.println("Enter Payment Type...   \n1.upi  \n2.card");
		String ch=sc.nextLine();
		
		System.out.println("Enter Payment Rs...");
		int amount=sc.nextInt();
		
		p1.operation(ch,amount);

		
		
	}

}
