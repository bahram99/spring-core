package hibernate.dataaccess;

import hibernate.HibernateCreateSession;
import hibernate.entity.User;
import hibernate.entity.book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class bookDAO {

    private SessionFactory sessionFactory;

    public bookDAO(){
        sessionFactory = HibernateCreateSession.getSessionFactory();
    }

    public void insertbook(){
        book b1 = new book(1,"bone","bahram");
        Session session =  sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(b1);
        transaction.commit();
        session.close();
    }

    public void userupdate(int id , String name){
        Session session =  sessionFactory.openSession();
        Transaction tran = session.beginTransaction();
        User user = session.get(User.class,id);
        user.setName(name);
        session.merge(user);
        tran.commit();
        session.close();
    }
    public User getuserbyid(int id){
        Session session =  sessionFactory.openSession();
        Transaction tran = session.beginTransaction();
        User user = session.get(User.class,id);
        tran.commit();

        session.createQuery("from User ");
        session.close();
        return user;
    }

}
