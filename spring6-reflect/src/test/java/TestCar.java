import com.lxd.reflect.Car;
import org.junit.jupiter.api.Test;
import org.springframework.context.event.EventPublicationInterceptor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestCar {

    // 1、获取Class对象多种方法
    @Test
    public void test1() throws Exception {
        // 1、类名.class
        Class clazz1 = Car.class;

        // 2、对象.getClass()
        Class clazz2 = new Car().getClass();

        // 3、Class.forName("全路径")
        Class clazz3 = Class.forName("com.lxd.reflect.Car");

        //实例化
        Car car = (Car)clazz3.getDeclaredConstructor().newInstance();
        System.out.println(car);

    }

    // 2、获取构造方法
    @Test
    public void test2() throws Exception {
        Class clazz = Car.class;
        //获取所有的构造
        //getConstructors 此方法获取所有共有的方法，getDeclaredConstructors 此方法获取所有的方法
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor c :constructors){
            System.out.println(c.getName() +"--"+ c.getParameterCount());
        }

        //指定有参构造创建对象
        //1、public
//        Constructor c1 = clazz.getConstructor(String.class, int.class, String.class);
//        Car car1 = (Car) c1.newInstance("Tv", 11, "red");
//        System.out.println("car1 = " + car1);
        //2、private
        Constructor c2 = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        c2.setAccessible(true);
        Car car2 = (Car) c2.newInstance("TT", 5, "red");
        System.out.println("car2 = " + car2);

    }

    // 3、获取属性
    @Test
    public void test3()throws Exception{
        Class clazz = Car.class;
        Car car = (Car)clazz.getDeclaredConstructor().newInstance();
        //获取共有的属性
        Field[] fields = clazz.getFields();
        //获取所有属性
        Field[] fields1 = clazz.getDeclaredFields();
        for(Field f : fields1){
            if(f.getName().equals("name")){
                f.setAccessible(true);
                f.set(car,"AA");
            }
            if(f.getName().equals("age")){
                f.setAccessible(true);
                f.set(car,2);
            }
            if(f.getName().equals("color")){
                f.setAccessible(true);
                f.set(car,"red");
            }
            System.out.println(f.getName());
        }
        System.out.println(car);


    }

    // 4、获取方法
    @Test
    public void test4()throws Exception {
        Car car = new Car("BB",6,"blue");
        Class clazz = car.getClass();

        Method[] methods = clazz.getDeclaredMethods();
        for(Method m : methods){
           // System.out.println(m.getName());
            //执行某个方法
            if(m.getName().equals("run")){
                m.setAccessible(true);
//                String invoke = (String) m.invoke(car);
//                System.out.println("run = " + invoke);
                m.invoke(car);
            }
        }

    }


}
