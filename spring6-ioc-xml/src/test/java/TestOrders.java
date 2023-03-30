
import com.lxd.spring6.iocxml.scope.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrders {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = context.getBean(Orders.class);
        System.out.println(orders);
        Orders orders1 = context.getBean(Orders.class);
        System.out.println(orders1);

    }
}

