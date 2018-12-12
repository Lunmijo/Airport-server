package dao;

import Entity.PlaneEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import javax.persistence.TypedQuery;
import java.util.List;

public class PlaneDAOImpl implements PlaneDAO {

    public PlaneEntity findByID(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(PlaneEntity.class, id);
    }
    public  PlaneEntity findByName(String name) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(PlaneEntity.class, name);
    }
    public  PlaneEntity findByAvaliableFreeSeats(int seatsNumber) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(PlaneEntity.class, seatsNumber);
    }
    public  PlaneEntity findByAvaliable() {
        int avaliable = 1;
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(PlaneEntity.class, avaliable);
    }
    public void save(PlaneEntity plane) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(plane);
        tx1.commit();
        session.close();
    }
    public void update(PlaneEntity plane) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(plane);
        tx1.commit();
        session.close();
    }
    public void delete(PlaneEntity plane) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(plane);
        tx1.commit();
        session.close();
    }
    public List<PlaneEntity> findAll() {
        TypedQuery<PlaneEntity> planes = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From PlaneEntity ");
        return planes.getResultList();
    }

}
