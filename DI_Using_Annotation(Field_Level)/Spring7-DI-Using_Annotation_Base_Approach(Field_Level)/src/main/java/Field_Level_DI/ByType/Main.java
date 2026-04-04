package Field_Level_DI.ByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Field_Level_DI.ByType.Target_Class.Car;

public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(RamConfig.class);
		Car c1=context.getBean(Car.class);
		c1.travel();
		
	}

}
