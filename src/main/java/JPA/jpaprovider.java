package JPA;

import org.hibernate.cfg.Configuration;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;
import javax.security.auth.login.AppConfigurationEntry;
import java.util.Map;

public class jpaprovider {

    private static EntityManagerFactory entityManagerFactory;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("persis");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
    public static EntityManager getEntityManager(){
        return getEntityManagerFactory().createEntityManager();
    }

}
