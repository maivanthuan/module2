package bai_tap_ngoai_2.service.impl;

import bai_tap_ngoai_2.model.Truck;
import bai_tap_ngoai_2.repository.ITruckRepository;
import bai_tap_ngoai_2.repository.impl.TruckRepository;
import bai_tap_ngoai_2.service.ITruckService;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
        private static Scanner scanner = new Scanner(System.in);
        private ITruckRepository iTruckRepository  = new TruckRepository();


        @Override
        public void addTrush() {
            Truck truck = this.inforTruck();
        }

        @Override
        public void removeTrush() {
            System.out.println("Nhập biển kiểm soát cần xóa: ");
            List<Truck> trushList = iTruckRepository.getAll();
            String removeStudent = scanner.nextLine();
            for (int index = 0; index < trushList.size(); index++) {
                if (removeStudent.equals(trushList.get(index).getBienKiemSoat())) {
                    trushList.remove(index);
                }
            }
        }

        @Override
        public void displayTrush() {
            List<Truck> trushList = iTruckRepository.getAll();
            for (Truck trush : trushList) {
                System.out.println(trush);
            }
        }

        @Override
        public void searchTruck(String biensoxe) {
            List<Truck> trushList = iTruckRepository.getAll();
            for (Truck trush : trushList) {
                if (trush.getBienKiemSoat().equals(biensoxe)) {
                    System.out.println(trush);
                }
            }

        }

        Truck inforTruck() {
            System.out.println("Nhập biển kiểm soát: ");
            String biensoxe = scanner.nextLine();
            System.out.println("Nhập tên hãng: ");
            String tenhangxe = scanner.nextLine();
            System.out.println("Nhập năm sản xuất: ");
            long namsanxuat = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập chủ sở hữu: ");
            String chusohuu = scanner.nextLine();
            System.out.println("Nhập trọng tải: ");
            double trongtai = Double.parseDouble(scanner.nextLine());
            Truck truck = new Truck(biensoxe, tenhangxe, namsanxuat, chusohuu, trongtai);
            return truck;
        }
    }

