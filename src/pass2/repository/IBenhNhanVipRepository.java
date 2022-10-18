package pass2.repository;

import pass2.model.Benhnhanvip;

import java.util.List;

public interface IBenhNhanVipRepository {
        String FILENAME_VIP="C:\\code gym\\Module 2\\module2\\src\\pass2\\data\\vip.csv";
    void addBenhnhanvip(Benhnhanvip benhnhanvip);
    void remove(Benhnhanvip benhnhanvip);
    List<Benhnhanvip> findAll();
}

