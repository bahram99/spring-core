package incompatiblebean.ravesh_3.Target_class;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Single single(){
        return new Single();
    }

    @Bean
    @Scope(value = "prototype",
           proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Prototype prototype(){
        return new Prototype();
    }

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Single single = context.getBean(Single.class);

        single.gettime();
        Thread.sleep(3000);
        single.gettime();
    }
}
