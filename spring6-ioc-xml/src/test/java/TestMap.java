import com.lxd.spring6.iocxml.dimap.Student;
import com.lxd.spring6.iocxml.dimap.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {
    @Test
    public void tset1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println("student = " + student);
        student.run();

    }
    @Test
    public void tset2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
        Teacher teacher1 = context.getBean("teacher1", Teacher.class);
        System.out.println("teacher1 = " + teacher1);

    }
    @Test
    public void tset3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = context.getBean("student", Student.class);
        student.run();
    }
}
