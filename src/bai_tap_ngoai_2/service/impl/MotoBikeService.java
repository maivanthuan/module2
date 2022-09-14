package bai_tap_ngoai_2.service.impl;
import bai_tap_ngoai_2.model.MotoBike;
import bai_tap_ngoai_2.repository.IMotoBikeRepository;
import bai_tap_ngoai_2.repository.impl.MotoBikeRepository;
import bai_tap_ngoai_2.service.IMotoBikeService;

import java.util.List;
import java.util.Scanner;

public class MotoBikeService implements IMotoBikeService {
    private static Scanner scanner = new Scanner(System.in);
    private IMotoBikeRepository iMotoBikeRepository = new MotoBikeRepository();


    @Override
    public void addMotoBike() {
        MotoBike motoBike = this.inforMotoBike();
    }

    @Override
    public void removeMotoBike() {
        System.out.println("Nhập biển kiểm soát cần xóa: ");
        List<MotoBike> motoBikes = iMotoBikeRepository.getAll();
        String removeStudent = scanner.nextLine();
        for (int index = 0; index < motoBikes.size(); index++) {
            if (removeStudent.equals(motoBikes.get(index).getBienKiemSoat())) {
                motoBikes.remove(index);
            }
        }
    }

    @Override
    public void displayMotoBike() {
        List<MotoBike> motoBikesList = iMotoBikeRepository.getAll();
        for (MotoBike motoBike : motoBikesList) {
            System.out.println(motoBike);
        }
    }

    @Override
    public void searchMotoBike(String biensoxe) {
        List<MotoBike> motoBikes = iMotoBikeRepository.getAll();
        for (MotoBike motoBike : motoBikes) {
            if (motoBike.getBienKiemSoat().equals(biensoxe)) {
                System.out.println(motoBike);
            }
        }
    }
            MotoBike inforMotoBike() {
            System.out.println("Nhập biển kiểm soát: ");
            String biensoxe = scanner.nextLine();
            System.out.println("Nhập tên hãng: ");
            String tenhangxe = scanner.nextLine();
            System.out.println("Nhập năm sản xuất: ");
            long namsanxuat = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập chủ sở hữu: ");
            String chusohuu = scanner.nextLine();
            System.out.println("Nhập công suất: ");
            long congsuat = Long.parseLong(scanner.nextLine());
            MotoBike motobike = new MotoBike(biensoxe, tenhangxe, namsanxuat, chusohuu, congsuat);
            return motobike;
        }
}
