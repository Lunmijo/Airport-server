package dao;

import Entity.UserEntity;

public interface UserDAO {
    public UserEntity findByID(int id);
    public  UserEntity findByLogin(String login);
    public  UserEntity findByEmail(String email);
    public  UserEntity findByTicketID(String ticketID);
    public  UserEntity findByRole(String role);
    public void save(UserEntity destination);
    public void update(UserEntity destination);
    public void delete(UserEntity destination);
}
