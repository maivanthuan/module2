package bai_tap_ngoai_2.repository;

import bai_tap_ngoai_2.model.Car;

import java.util.List;

public interface ICarRepository {
    void addCar(Car car);
    List<Car>getAll();
}
