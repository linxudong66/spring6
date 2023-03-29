import com.lxd.spring6.iocxml.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("bean.xml");

        //根据id获取Bean
        User user = (User) context.getBean("user");
        System.out.println("user-根据id获取Bean = " + user);

        //根据类型获取Bean
        User user1 = context.getBean(User.class);
        System.out.println("user1-根据类型获取Bean = " + user1);

        //根据id和类型获取Bean
        User user2 = context.getBean("user", User.class);
        System.out.println("user2-根据id和类型获取Bean = " + user2);
    }
}
