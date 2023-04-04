import com.lxd.spring6.iocxml.auto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetUserAuto {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("bean.auto.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.addUser();
    }
}
