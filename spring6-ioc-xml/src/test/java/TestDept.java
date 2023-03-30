import com.lxd.spring6.iocxml.ditest.Dept;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDept {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
        Dept dept = context.getBean("dept", Dept.class);
        dept.info();

    }
}
