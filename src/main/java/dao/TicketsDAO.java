package dao;

import Entity.FlightsEntity;
import Entity.TicketEntity;

import java.util.List;

public interface TicketsDAO {
    TicketEntity findByID(int id);
    TicketEntity findByUserID(int userID);
    TicketEntity findByPrice(float price);
    TicketEntity findByFlightID(int flightID);
    void save(TicketEntity flight);
    void update(TicketEntity flight);
    void delete(TicketEntity flight);
    List<TicketEntity> findAll();
}
