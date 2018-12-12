package dao;

import Entity.DestinationsEntity;

import java.util.List;

public interface DestinationsDAO {

    DestinationsEntity findByID(int id);
    DestinationsEntity findByCity(String city);
    void save(DestinationsEntity destination);
    void update(DestinationsEntity destination);
    void delete(DestinationsEntity destination);
    List<DestinationsEntity> findAll();
}
