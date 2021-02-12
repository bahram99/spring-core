package annotationConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
public class annotationconfig {
    @Bean
    public one myone(){
        return new one();
    }

    @Bean
    @Qualifier("t-1")
    public Two mytwo(){
        return new Two(99900);
    }
    @Bean
    @Qualifier("t-2")
    public Two mytwo2(){
        return new Two(4400);
    }
    @Bean("t-3")
    public Two mytwo3(){
        return new Two(1111);
    }
    @Bean("th-1")
    @Scope("prototype")
    public Three three1(){
        return new Three();
    }

    public static void main(String[] args) {
        ApplicationContext context = new   AnnotationConfigApplicationContext(annotationconfig.class);
        one one = (one) context.getBean(annotationConfig.one.class);
        Three three1 = context.getBean(Three.class);
        three1.setNum("akbarii");
        System.out.println(three1);
        Three three2 = context.getBean(Three.class);
        System.out.println(three2.getNum());
        System.out.println(three2);
        System.out.println(one.getTwo().getName());

    }
}
