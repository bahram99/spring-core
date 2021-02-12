package anisa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("my-config.xml");

        Person p = (Person) context.getBean("pers");
        Car c1 = (Car) context.getBean("car1");
        /*System.out.println(p.getCar().getName());

        Car c = (Car) context.getBean("car1");

        Person p2 = (Person) context.getBean("person2");
        System.out.println(p2.getId()+" "+p2.getCar().getName());
*/



    }
}
