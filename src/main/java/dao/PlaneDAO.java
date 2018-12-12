package dao;

import Entity.PlaneEntity;

import java.util.List;

public interface PlaneDAO {
    PlaneEntity findByID(int id);
    PlaneEntity findByName(String name);
    PlaneEntity findByAvaliableFreeSeats(int seatsNumber);
    PlaneEntity findByAvaliable();
    void save(PlaneEntity plane);
    void update(PlaneEntity plane);
    void delete(PlaneEntity plane);
    List<PlaneEntity> findAll();
}
