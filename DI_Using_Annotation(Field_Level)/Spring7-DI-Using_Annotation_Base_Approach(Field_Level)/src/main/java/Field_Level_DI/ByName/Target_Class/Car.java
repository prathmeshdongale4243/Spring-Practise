package Field_Level_DI.ByName.Target_Class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import Field_Level_DI.ByName.Dependant_Class.Engin;
@Component
public class Car
{
	@Autowired
	@Qualifier("Petrol")
	Engin eng;

	public void travel()
	{
		eng.start();
	}
}
