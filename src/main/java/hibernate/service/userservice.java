package hibernate.service;

import hibernate.dataaccess.bookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.PersistenceContext;

@Service
public class userservice {

    @PersistenceContext
    public bookDAO dao;


    public void update(int id , String name){
        dao.userupdate(id,name);
    }
}
