package BaseModel.UserService;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import BaseModel.UserDao.*;

@Service
public class UserService
{
	
	@Autowired
	@Qualifier("daouser")   // bytype
	DaoInterface daouser;   // byname
	
	
	
	
	
	public void getReport()
	{
		
		daouser.getData();
	}

}
