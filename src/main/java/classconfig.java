import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@ComponentScan
@Configuration
public class classconfig {

    @Bean
    @Lazy
    @Scope("singleton")
    person persons(){
        return new person();
    }

    @Bean
    @Scope("prototype")
    public family famil(){
        return new family();
    }

    @Value("salam")
    private String num;

    @Bean
    public String str(){
        return  num;
    }
}
