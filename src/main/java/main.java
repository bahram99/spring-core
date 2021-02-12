import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");



        person p1 = (person) context.getBean("pers");
        System.out.println(p1);

        person p2 = (person) context.getBean("salam");
        System.out.println(p2);



    }
}
