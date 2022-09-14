package bai_tap_ngoai_2.repository.impl;

import bai_tap_ngoai_2.model.Car;
import bai_tap_ngoai_2.repository.ICarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private static List<Car>carList=new ArrayList<>();
    static {
        carList.add(new Car("123","MEC",2012,"Thuận",4,"du lịch"));
        carList.add(new Car("124","MADA",2008,"Mai",16,"xe khách"));
        carList.add(new Car("125","BMW",2022,"Huy",4,"du lịch"));
        carList.add(new Car("126","AUDI",2020,"Bảo",8,"xe khách"));
    }
    @Override
    public void addCar(Car car) {
        carList.add(car);
    }

    @Override
    public List<Car> getAll() {
        return carList;
    }
}
