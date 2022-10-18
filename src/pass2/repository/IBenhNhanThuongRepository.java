package pass2.repository;

import pass2.model.Benhnhanthuong;
import pass2.model.Benhnhanvip;

import java.util.List;

public interface IBenhNhanThuongRepository {
    String FILENAME_THUONG="C:\\code gym\\Module 2\\module2\\src\\pass2\\data\\thuong.csv";
    void addBenhnhanthuong(Benhnhanthuong benhnhanthuong);
    void remove(Benhnhanthuong benhnhanthuong);
    List<Benhnhanthuong> findAll();
}
