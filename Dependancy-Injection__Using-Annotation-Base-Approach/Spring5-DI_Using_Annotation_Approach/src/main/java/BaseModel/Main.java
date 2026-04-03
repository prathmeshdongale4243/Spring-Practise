package BaseModel;
import org.springframework.context.*;
import org.springframework.context.annotation.*;

import BaseModel.UserService.*;


public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(ShyamConfig.class);
		UserService u1=context.getBean(UserService.class);
		u1.getReport();
	
		AdminService a1=context.getBean(AdminService.class);
	    a1.getReport();
	}

}
