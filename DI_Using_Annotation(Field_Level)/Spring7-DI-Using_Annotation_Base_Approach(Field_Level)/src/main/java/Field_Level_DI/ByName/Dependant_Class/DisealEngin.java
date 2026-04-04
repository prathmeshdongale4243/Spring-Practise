package Field_Level_DI.ByName.Dependant_Class;

import org.springframework.stereotype.Component;

@Component("Diseal")
public class DisealEngin implements Engin
{
	public void start()
	{
		System.out.println("Car Start With Diseal Engin...");
	}

}
