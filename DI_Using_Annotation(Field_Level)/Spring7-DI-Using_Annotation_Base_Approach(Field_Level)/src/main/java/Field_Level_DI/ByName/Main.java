package Field_Level_DI.ByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Field_Level_DI.ByName.Target_Class.Car;

public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(RamConfig1.class);
		Car c1=context.getBean(Car.class);
		c1.travel();
		
	}

}
