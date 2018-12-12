package dao;

import Entity.DestinationsEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.annotations.Table;
import org.hibernate.query.Query;
import utils.HibernateSessionFactoryUtil;

import javax.persistence.TypedQuery;
import javax.print.attribute.standard.Destination;
import javax.transaction.Transactional;
import java.util.List;


public class DestinationsDAOImpl implements DestinationsDAO {

    public DestinationsEntity findByID(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(DestinationsEntity.class, id);
    }
    public  DestinationsEntity findByCity(String city) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(DestinationsEntity.class, city);
    }
    //@Transactional
    public void createTransaction() {

    }
    public void save(DestinationsEntity destination) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(destination);
        tx1.commit();
        session.close();
    }
    public void update(DestinationsEntity destination) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(destination);
        tx1.commit();
        session.close();
    }
    public void delete(DestinationsEntity destination) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(destination);
        tx1.commit();
        session.close();
    }

    public List<DestinationsEntity> findAll() {
        TypedQuery<DestinationsEntity> destinations = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From DestinationsEntity ");
        return destinations.getResultList();
    }

}
