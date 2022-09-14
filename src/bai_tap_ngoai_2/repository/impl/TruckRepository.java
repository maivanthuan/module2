package bai_tap_ngoai_2.repository.impl;

import bai_tap_ngoai_2.model.Truck;
import bai_tap_ngoai_2.repository.ITruckRepository;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private static List<Truck>trushList=new ArrayList<>();
    static {
        trushList.add(new Truck("345","Isuzu",2022,"Thuận",15));
        trushList.add(new Truck("346","Hino",2022,"Mai",16));
        trushList.add(new Truck("347","Hyundai",2022,"Trần",17));
        trushList.add(new Truck("348","Daewoo",2022,"Lê",18));
    }
    @Override
    public void addTrush(Truck trush) {
        trushList.add(trush);
    }

    @Override
    public List<Truck> getAll() {
        return trushList;
    }
}
