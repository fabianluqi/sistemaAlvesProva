package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;

public abstract class DAO_Abstract {

    public Session session;

    public DAO_Abstract() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public abstract void insert(Object objeto);

    public abstract void update(Object objeto);

    public abstract void delete(Object objeto);

    public abstract Object list(int codigo);

    public abstract ArrayList listAll();

}
