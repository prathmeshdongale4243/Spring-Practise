package com.DI;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args) 
	{
		//Constructot level Dependancy Injection....
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("Ram.xml");
		 
		System.out.println("Please choose payment option.... \n1.UPI Payment \n2.Card Payment ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			PaymentService p1=context.getBean("p1",PaymentService.class);
			System.out.println("Enter pay Amount :- ");
			int amount=sc.nextInt();
			p1.operation(amount);
			break;
		
		case 2:
			PaymentService p2=context.getBean("p2",PaymentService.class);
			System.out.println("Enter pay Amount :- ");
			amount=sc.nextInt();
			p2.operation(amount);
			break;
		default :
			System.out.println("Please enter correct option...");
		}
	
	}

}
