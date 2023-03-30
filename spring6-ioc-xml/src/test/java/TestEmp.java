import com.lxd.spring6.iocxml.ditest.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
//        Emp emp = context.getBean("emp2", Emp.class);
//        emp.work();
//
//    }
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.work();

    }
}
