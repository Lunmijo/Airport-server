package dao;

import Entity.PlaneEntity;

public interface PlaneDAO {
    public PlaneEntity findByID(int id);
    public  PlaneEntity findByName(String name);
    public  PlaneEntity findByAvaliableFreeSeats(int seatsNumber);
    public  PlaneEntity findByAvaliable();
    public void save(PlaneEntity plane);
    public void update(PlaneEntity plane);
    public void delete(PlaneEntity plane);
}
