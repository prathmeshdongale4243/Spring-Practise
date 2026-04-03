package com.DI_Field;

public class Note
{
	Notification note;

	Note()
	{
		System.out.println("Default constructor is used for autowire='byName'");
	}
	Note(Notification note)
	{
		this.note=note;
	}
	public void setNote(Notification note)
	{
		this.note=note;
	}
	
	public void operation(String mesg)
	{
		note.message(mesg);
	}
}
