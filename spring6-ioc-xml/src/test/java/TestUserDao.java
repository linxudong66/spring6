import com.lxd.spring6.iocxml.bean.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
       UserDao userDao = context.getBean(UserDao.class);
        System.out.println("userDao = " + userDao);
        userDao.run();

    }
}
