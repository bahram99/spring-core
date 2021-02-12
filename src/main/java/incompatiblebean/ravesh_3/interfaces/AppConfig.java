package incompatiblebean.ravesh_3.interfaces;

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
           proxyMode = ScopedProxyMode.INTERFACES)
    public protointerfaces protointerfaces(){
        return new protoimpl();
    }

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Single single = context.getBean(Single.class);

        single.gettime();
        Thread.sleep(4000);
        single.gettime();
    }
}
