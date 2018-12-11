package dao;

import Entity.DestinationsEntity;

public interface DestinationsDAO {

    public DestinationsEntity findByID(int id);
    public  DestinationsEntity findByCity(String city);
    public void save(DestinationsEntity destination);
    public void update(DestinationsEntity destination);
    public void delete(DestinationsEntity destination);
}
