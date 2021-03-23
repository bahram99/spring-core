package hibernate;

import hibernate.dataaccess.bookDAO;
import hibernate.entity.Employee;
import hibernate.entity.User;
import hibernate.service.userservice;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class hibernatemain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateCreateSession.getSessionFactory();


        userservice userservice = new userservice();
        userservice.update(1,"siros");

    }
}
