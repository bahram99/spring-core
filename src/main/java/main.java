import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.misc.ThreadGroupUtils;

@PropertySource(value = "data.properties")
public class main {

    @Value("name")
    private String name;

    public void getmyname() {
        System.out.println("sa " + name);
        System.out.println();
    }



    public static void main(String[] args) {
        main m = new main();


        m.getmyname();
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        person p1 = (person) context.getBean("pers");
        System.out.println(p1);

        person p2 = (person) context.getBean("salam");
        System.out.println(p2);


    }
}
