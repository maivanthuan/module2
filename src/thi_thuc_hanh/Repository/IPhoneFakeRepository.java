package thi_thuc_hanh.Repository;

import thi_thuc_hanh.Model.PhoneFake;

import java.util.List;

public interface IPhoneFakeRepository {
    void add(PhoneFake phoneFake);
    void remove(PhoneFake phoneFake);
    List<PhoneFake>getAll();
}
