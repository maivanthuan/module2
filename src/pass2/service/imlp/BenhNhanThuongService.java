package pass2.service.imlp;

import pass2.model.Benhnhanthuong;
import pass2.model.Benhnhanvip;
import pass2.repository.IBenhNhanThuongRepository;
import pass2.repository.IBenhNhanVipRepository;
import pass2.repository.impl.BenhNhanThuongRepository;
import pass2.repository.impl.BenhNhanVipRepository;
import pass2.service.IBenhNhanThuongService;

import java.util.List;

public class BenhNhanThuongService implements IBenhNhanThuongService {
    IBenhNhanThuongRepository iBenhNhanThuongRepository = new BenhNhanThuongRepository();
    List<Benhnhanthuong> benhnhanthuongList = iBenhNhanThuongRepository.findAll();
    @Override
    public void addBenhNhanThuong() {
        Benhnhanthuong benhnhanthuong = new Benhnhanthuong();
        benhnhanthuong.infoBenhnhanthuong();
        iBenhNhanThuongRepository.addBenhnhanthuong(benhnhanthuong);
    }

//    @Override
//    public void removeBenhNhanThuong(String sothutu) {
//        Benhnhanthuong benhnhanthuong1 = null;
//        for (Benhnhanthuong benhnhanthuong : benhnhanthuongList) {
//            if (benhnhanthuong.getSothutu() == id) {
//                benhnhanthuong1 = benhnhanthuong;
//                break;
//            }
//            if (benhnhanthuong1 != null) {
//                iBenhNhanThuongRepository.remove(benhnhanthuong);
//                System.out.println("Xoa thanh cong: ");
//            } else {
//                System.out.println("Not found");
//            }
//        }
//    }

    @Override
    public void dispalyBenhNhanThuong() {
        for (Benhnhanthuong benhnhanthuong : benhnhanthuongList) {
            System.out.println(benhnhanthuong);
        }

    }
}
