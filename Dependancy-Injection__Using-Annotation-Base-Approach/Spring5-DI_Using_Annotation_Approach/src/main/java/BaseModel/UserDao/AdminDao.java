package BaseModel.UserDao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.*;


@Repository
@Primary
public class AdminDao implements DaoInterface
{
	public void getData()
	{
		System.out.println("Admin data passess to service");
	}

}
