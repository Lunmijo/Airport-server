package dao;

import Entity.FlightsEntity;

import java.util.List;

public interface FlightsDAO {
    FlightsEntity findByID(int id);
    FlightsEntity findByDepature(String city);
    FlightsEntity findByDestination(String city);
    FlightsEntity findByDateTimeFrom(String time);
    FlightsEntity findByDateTimeArrive(String time);
    void save(FlightsEntity flight);
    void update(FlightsEntity flight);
    void delete(FlightsEntity flight);
    List<FlightsEntity> findAll();

}
