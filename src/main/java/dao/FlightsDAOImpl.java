package dao;

import Entity.FlightsEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import javax.persistence.TypedQuery;
import java.util.List;

public class FlightsDAOImpl implements FlightsDAO {

    public FlightsEntity findByID(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(FlightsEntity.class, id);
    }

    public  FlightsEntity findByDepature(String city) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(FlightsEntity.class, city);
    }

    public  FlightsEntity findByDestination(String city) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(FlightsEntity.class, city);
    }

    public  FlightsEntity findByDateTimeFrom(String time) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(FlightsEntity.class, time);
    }

    public  FlightsEntity findByDateTimeArrive(String time) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(FlightsEntity.class, time);
    }

    public void save(FlightsEntity flight) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(flight);
        tx1.commit();
        session.close();
    }

    public void update(FlightsEntity flight) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(flight);
        tx1.commit();
        session.close();
    }

    public void delete(FlightsEntity flight) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(flight);
        tx1.commit();
        session.close();
    }

    public List<FlightsEntity> findAll() {
        TypedQuery<FlightsEntity> flights = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From FlightsEntity ");
        return flights.getResultList();
    }


}
