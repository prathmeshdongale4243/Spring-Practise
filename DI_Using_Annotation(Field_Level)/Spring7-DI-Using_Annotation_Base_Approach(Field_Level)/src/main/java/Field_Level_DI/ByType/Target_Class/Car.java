package Field_Level_DI.ByType.Target_Class;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import Field_Level_DI.ByType.Dependant_Class.Engin;
@Component
public class Car
{

	@Autowired
	Engin eng;
	
	public void travel()
	{
		eng.start();
	}
}
