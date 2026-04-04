package Field_Level_DI.ByName.Dependant_Class;

import org.springframework.stereotype.Component;

@Component("Petrol")
public class PetrolEngin implements Engin
{
	public void start()
	{
		System.out.println("Car Start with Petrol Engin ");
	}

}
