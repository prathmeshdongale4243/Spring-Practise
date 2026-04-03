package com.DI_Setter;

public class Car 
{
	//Terget Class
	
	Engin eng;
	
	public void setEngin(Engin eng)
	{
		this.eng=eng;
		
	}

	public void journy()
	{
		eng.start();
	}
}
