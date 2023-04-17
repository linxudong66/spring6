import com.lxd.bean.AnnotationApplicationContext;
import com.lxd.bean.ApplicationContext;
import com.lxd.service.UserService;
import org.junit.jupiter.api.Test;

public class TestUser {
    @Test
    public void test1(){
        ApplicationContext context = new AnnotationApplicationContext("com.lxd");
        UserService userService = (UserService) context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
