package bai_tap_ngoai_2.repository.impl;

import bai_tap_ngoai_2.model.Car;
import bai_tap_ngoai_2.model.MotoBike;
import bai_tap_ngoai_2.repository.IMotoBikeRepository;

import java.util.ArrayList;
import java.util.List;

public class MotoBikeRepository implements IMotoBikeRepository {
    private static List<MotoBike>motoBikeList=new ArrayList<>();
    static {
        motoBikeList.add(new MotoBike("123","Honda",2022,"Thuận",50));
        motoBikeList.add(new MotoBike("124","Suyuki",2022,"Mai",155));
        motoBikeList.add(new MotoBike("125","Yamaha",2022,"Quánh",125));
        motoBikeList.add(new MotoBike("126","Sirius",2022,"Trung",150));
    }
    @Override
    public void addMotoBike(MotoBike motoBike) {
        motoBikeList.add(motoBike);
}
    @Override
    public List<MotoBike> getAll() {
        return motoBikeList;
    }
}
