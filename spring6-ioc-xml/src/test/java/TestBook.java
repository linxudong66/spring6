import com.lxd.spring6.iocxml.di.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println("Book = " + book);
    }
    @Test
    public void test2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("bookCon", Book.class);
        System.out.println("Book = " + book);
    }
}
