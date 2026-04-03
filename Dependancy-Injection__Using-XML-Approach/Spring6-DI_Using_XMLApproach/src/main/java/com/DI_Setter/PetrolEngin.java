package com.DI_Setter;

public class PetrolEngin implements Engin
{
	//Dependant Class
	public PetrolEngin(int a,int b)
	{
		System.out.println("PetrolEngin 2 Parameter Constructor Called");
	}
	public void start()
	{
		System.out.println("Engin Started with Diseal....\nHappy Journy Ram...");
		
	}

}
