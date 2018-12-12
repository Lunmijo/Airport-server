package dao;

import Entity.UserEntity;

import java.util.List;

public interface UserDAO {
    UserEntity findByID(int id);
    UserEntity findByLogin(String login);
    UserEntity findByEmail(String email);
    UserEntity findByTicketID(String ticketID);
    UserEntity findByRole(String role);
    void save(UserEntity destination);
    void update(UserEntity destination);
    void delete(UserEntity destination);
    List<UserEntity> findAll();
}
