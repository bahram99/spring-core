package incompatiblebean.ravesh_2;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Single single(){
        return new Single();
    }

    @Bean
    @Scope("prototype")
    public Prototype prototype(){
        return new Prototype();
    }

    @Bean
    @Scope("singleton")
    public onescop sss(){
        return new onescop();
    }

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Single single = context.getBean(Single.class);

        single.gettime();
        Thread.sleep(3000);
        single.gettime();

        onescop a = context.getBean(onescop.class);
        a.setNam("bahram");
        System.out.println(a.getNam());

        onescop b = context.getBean(onescop.class);
        System.out.println(b.getNam());
        a.setNam("ali");
        System.out.println(a.getNam());
    }
}
