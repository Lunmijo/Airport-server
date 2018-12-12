package dao;

import Entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    public UserEntity findByID(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(UserEntity.class, id);
    }
    public  UserEntity findByLogin(String login) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(UserEntity.class, login);
    }
    public  UserEntity findByEmail(String email) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(UserEntity.class, email);
    }
    public  UserEntity findByTicketID(String ticketID) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(UserEntity.class, ticketID);
    }
    public  UserEntity findByRole(String role) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(UserEntity.class, role);
    }
    public void save(UserEntity user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }
    public void update(UserEntity ticket) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(ticket);
        tx1.commit();
        session.close();
    }
    public void delete(UserEntity ticket) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(ticket);
        tx1.commit();
        session.close();
    }

    public List<UserEntity> findAll() {
        TypedQuery<UserEntity> users = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From DestinationsEntity ");
        return users.getResultList();
    }

}
