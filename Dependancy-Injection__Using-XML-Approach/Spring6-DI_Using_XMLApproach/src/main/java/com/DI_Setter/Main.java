package com.DI_Setter;
import java.util.*;

import org.springframework.context.*;
import org.springframework.context.support.*;



public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ApplicationContext context =new ClassPathXmlApplicationContext("RamSetter.xml");
		
		
		System.out.println("Which Engin Started...\n1.Diseal  \n2.Petrol");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			Car c1=context.getBean("c1",Car.class);
			c1.journy();
			break;
			
		case 2:
			Car c2=context.getBean("c2",Car.class);
			c2.journy();
			break;
			
		default:
			System.out.println("Please, Enter Correct Choice...");
		}
		
		
	}

}
