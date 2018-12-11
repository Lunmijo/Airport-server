package dao;

import Entity.TicketEntity;

public interface TicketsDAO {
    public TicketEntity findByID(int id);
    public  TicketEntity findByUserID(int userID);
    public  TicketEntity findByPrice(float price);
    public  TicketEntity findByFlightID(int flightID);
    public void save(TicketEntity flight);
    public void update(TicketEntity flight);
    public void delete(TicketEntity flight);
}
