package com.DI_Field;

public class SMSNotification implements Notification
{
	public void message(String mesg)
	{
		System.out.println(mesg);
		System.out.println("Message get through sms");
	}

}
