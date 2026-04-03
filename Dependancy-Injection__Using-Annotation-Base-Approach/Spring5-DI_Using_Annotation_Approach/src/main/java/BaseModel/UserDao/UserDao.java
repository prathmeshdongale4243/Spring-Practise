package BaseModel.UserDao;
import org.springframework.stereotype.*;


@Repository("daouser")
public class UserDao implements DaoInterface
{
	public void getData()
	{
		System.out.println("User Data Passes to service");
	}

}
