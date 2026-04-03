package com.DI_Field;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args)
	{
		//Field Level Dependency Injection
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("RamField.xml");
		
		
		System.out.println("Enter Choice Notification type ....");
		System.out.println("1.SMS Notification (Using byName)");
		System.out.println("2.Email Notification (Using byType)");
		System.out.println("3.Email Notification (Using constructor)");
		int ch=sc.nextInt();
		sc.nextLine();
		switch(ch)
		{
			case 1:
				System.out.println("Enter Message...");
				String mesg=sc.nextLine();
				Note n1=context.getBean("n1",Note.class);    // autowire="byName"
				n1.operation(mesg);
				break;
			
			case 2:
				System.out.println("Enter Message...");
				mesg=sc.nextLine();
				Note n2=context.getBean("n2",Note.class);
				n2.operation(mesg);
				break;
				
			case 3:
				System.out.println("Enter Message...");
				mesg=sc.nextLine();
				Note n3=context.getBean("n3",Note.class);
				n3.operation(mesg);
				break;
		
		}
		
		
	}
	
	
	

}
