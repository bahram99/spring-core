package circulardependency;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackageClasses = CircularMain.class , useDefaultFilters = false)
public class CircularMain {
    //----------------------setter injection
    /*@Component
    public static class One{
        private Two two;

        public void setTwo(Two two) {
            this.two = two;
        }
    }

    @Component
    public static class Two{
        private One one;

        public void setOne(One one) {
            this.one = one;
        }
    }*/

    //----------------------- @Lazy inject
    @Component
    public static class One{
        private Two two;

        public void setTwo(Two two) {
            this.two = two;
        }
    }

    @Lazy
    @Component
    public static class Two{
        private One one;

        public void setOne(One one) {
            this.one = one;
        }
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CircularMain.class);

    }
}
