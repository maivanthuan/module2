package thi_thuc_hanh.Service.impl;

import bai_tap_ngoai_2.repository.ICarRepository;
import bai_tap_ngoai_2.repository.impl.CarRepository;
import thi_thuc_hanh.Model.PhoneFake;
import thi_thuc_hanh.Model.PhoneReal;
import thi_thuc_hanh.Repository.IPhoneRealRepository;
import thi_thuc_hanh.Repository.PhoneRealRepository;
import thi_thuc_hanh.Service.IPhoneRealService;

import java.util.List;
import java.util.Scanner;

public class PhoneRealService implements IPhoneRealService {
  IPhoneRealRepository iPhoneRealRepository=new PhoneRealRepository();
   List<PhoneReal>phoneRealList=iPhoneRealRepository.getAll();
    @Override
    public void addPhoneReal() {
       PhoneReal phoneReal=new PhoneReal();
       phoneReal.info();
    }

    @Override
    public void removePhoneReal() {

    }

    @Override
    public void displayPhoneReal() {

    }

    @Override
    public void SearchPhoneReal() {

    }
//    PhoneReal inforreal () {
//        System.out.println("Nhập id: ");
//        int id = Integer.parseInt(scanner .nextLine());
//        System.out.println("Nhập tên sản phẩm: ");
//        String tensanpham = scanner.nextLine();
//        System.out.println("Nhập giá bán: ");
//        double gia = Double.parseDouble(scanner.nextLine());
//        System.out.println("Nhập số lượng: ");
//        int soluong = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập nhà sản xuất: ");
//        String nhasanxuat = scanner.nextLine();
//        System.out.println("Nhập thời gian bảo hành: ");
//        String thoigianbaohanh = scanner.nextLine();
//        System.out.println("Nhập phạm vi bảo hành: ");
//        String phamvibaohanh=scanner.nextLine();
//        PhoneReal phoneReal = new PhoneReal(id, tensanpham, gia, soluong, nhasanxuat, thoigianbaohanh, phamvibaohanh);
//        return phoneReal;
//    }
}
