package hibernate;

import hibernate.dataaccess.bookDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
public class config {

    @Bean
    @Qualifier("bok")
    public bookDAO getbookDAO(){
        return new bookDAO();
    }
}
