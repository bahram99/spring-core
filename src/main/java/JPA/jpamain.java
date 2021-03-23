package JPA;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpamain {

    public static void main(String[] args) {
        //jpaservice jpaservice = new jpaservice();
        //jpaservice.getdatabyid(1);

        EntityManagerFactory fact = Persistence.createEntityManagerFactory("salam");
        System.out.println(fact);
    }

}
