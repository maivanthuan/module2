package thi_thuc_hanh.Repository;

import thi_thuc_hanh.Model.PhoneReal;

import java.util.List;

public interface IPhoneRealRepository {
    void add(PhoneReal phoneReal);
    void remove(PhoneReal phoneReal);
    List<PhoneReal>getAll();
}
