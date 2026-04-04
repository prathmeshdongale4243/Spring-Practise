package Field_Level_DI.ByType.Dependant_Class;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngin implements Engin
{

	public void start()
	{
		System.out.println("Petrol Engin Started...");
	}
}
