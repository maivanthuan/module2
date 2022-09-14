package bai_tap_ngoai_2.repository;

import bai_tap_ngoai_2.model.Truck;

import java.util.List;

public interface ITruckRepository {
    void addTrush(Truck trush) ;

    List<Truck>getAll();
}
