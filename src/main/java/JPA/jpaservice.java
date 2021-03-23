package JPA;

import hibernate.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class jpaservice {

    public void getdatabyid(int id){
        EntityManager entityManager = jpaprovider.getEntityManager();
        User user = entityManager.find(User.class,1);
        System.out.println(user);
        entityManager.close();
    }
}
