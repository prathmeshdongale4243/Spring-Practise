package BaseModel.UserService;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import BaseModel.UserDao.DaoInterface;
@Service
public class AdminService
{
//	@Autowired
//	@Qualifier("daoadmin")
	DaoInterface dao;
	
	AdminService()
	{
		
	}
	
	//When in target class 2 constructors one is default constructor
	// and other is parameterized constructor then 
	//IOC give first preference to the default constructor,
	//so get error.
	
	//that time we are require @Autowired annotation
	//because when we call dao.getReport() that time get error 
	//"Null Pointer exception" because dao in null , 
	
	//@Autowired annotation is uses to explicitly call 
	//Parameterizes cobstructor. @Autowired says spring that ,
	// parameterized constructor uses for Dependencies Injection. 
	
	
	//sp spring will inject DaoInterface 
	//implementation into the dao variable.
	
//      |	    
//      |
//  ----^---- 
	
//	@Autowired
//	AdminService(DaoInterface dao)  //Constructor Level Dependincies Injection
//	{
//	   System.out.println("Constructor Level Dependencies Injection");
//		this.dao=dao;
//	}
//	
	//OR
	
	@Autowired
	public void setDao(DaoInterface dao) //Setter level Dependencies Injection.
	{
		System.out.println("Setter Level Dependencies Injection");
		this.dao=dao;
		
	}
	
    
	public void getReport()
	{
		dao.getData();
	}

}
