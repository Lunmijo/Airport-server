package dao;

import Entity.FlightsEntity;
import Entity.TicketEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import javax.persistence.TypedQuery;
import java.util.List;

public class TicketsDAOImpl implements TicketsDAO {
    public TicketEntity findByID(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(TicketEntity.class, id);
    }
    public  TicketEntity findByUserID(int userID) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(TicketEntity.class, userID);
    }
    public  TicketEntity findByPrice(float price) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(TicketEntity.class, price);
    }
    public  TicketEntity findByFlightID(int flightID) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(TicketEntity.class, flightID);
    }
    public void save(TicketEntity ticket) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(ticket);
        tx1.commit();
        session.close();
    }
    public void update(TicketEntity ticket) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(ticket);
        tx1.commit();
        session.close();
    }
    public void delete(TicketEntity ticket) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(ticket);
        tx1.commit();
        session.close();
    }

    public List<TicketEntity> findAll() {
        TypedQuery<TicketEntity> tickets = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From DestinationsEntity ");
        return tickets.getResultList();
    }

}
