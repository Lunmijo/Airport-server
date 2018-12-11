package dao;

import Entity.FlightsEntity;

public interface FlightsDAO {
    public FlightsEntity findByID(int id);
    public  FlightsEntity findByDepature(String city);
    public  FlightsEntity findByDestination(String city);
    public  FlightsEntity findByDateTimeFrom(String time);
    public  FlightsEntity findByDateTimeArrive(String time);
    public void save(FlightsEntity flight);
    public void update(FlightsEntity flight);
    public void delete(FlightsEntity flight);
}
