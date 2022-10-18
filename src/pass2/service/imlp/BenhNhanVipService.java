package pass2.service.imlp;

import bai_tap_ngoai_2.model.Car;
import pass2.model.Benhnhanthuong;
import pass2.model.Benhnhanvip;
import pass2.repository.IBenhNhanVipRepository;
import pass2.repository.impl.BenhNhanVipRepository;
import pass2.service.IBenhNhanVipService;

import java.util.List;
import java.util.Scanner;

public class BenhNhanVipService implements IBenhNhanVipService {
    IBenhNhanVipRepository iBenhNhanVipRepository = new BenhNhanVipRepository();
    List<Benhnhanvip> benhnhanvipList = iBenhNhanVipRepository.findAll();

    @Override
    public void addBenhNhanVip() {
        Benhnhanvip benhnhanvip = new Benhnhanvip();
        benhnhanvip.infoBenhnhanvip();
        iBenhNhanVipRepository.addBenhnhanvip(benhnhanvip);
    }

//    @Override
//    public void removeBenhNhanVip(String sothutu) {
//
//        Benhnhanvip benhnhanvip1 = null;
//        for (Benhnhanvip benhnhanvip : benhnhanvipList) {
//            if (benhnhanvip.getSothutu() == id) {
//                benhnhanvip1 = benhnhanvip;
//                break;
//            }
//        }
//        if (benhnhanvip1 != null) {
//            iBenhNhanVipRepository.remove(benhnhanvip1);
//            System.out.println("Xoa thanh cong: ");
//        } else {
//            System.out.println("Not found");
//        }
//    }

    @Override
    public void dispalyBenhNhanVip() {
        for (Benhnhanvip benhnhanvip : benhnhanvipList) {
            System.out.println(benhnhanvip);
        }
    }
}
//        CellPhone cellPhoneObj = null;
//        for (CellPhone cellPhone : cellPhoneList) {
//            if (cellPhone.getId() == id) {
//                cellPhoneObj=cellPhone;
//                break;