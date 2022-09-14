package bai_tap_ngoai_2.controller;

import bai_tap_ngoai_2.service.ICarService;
import bai_tap_ngoai_2.service.IMotoBikeService;
import bai_tap_ngoai_2.service.ITruckService;
import bai_tap_ngoai_2.service.impl.CarService;
import bai_tap_ngoai_2.service.impl.MotoBikeService;
import bai_tap_ngoai_2.service.impl.TruckService;

import java.util.Scanner;

public class RemoveController {
    private static final Scanner scanner=new Scanner(System.in);
    private static final ICarService iCarService= new CarService();
    private static final IMotoBikeService iMotoBikeService=new MotoBikeService();
    private static final ITruckService iTruckService=new TruckService();
    public static void removeMenu() {

        do {
            System.out.println("1.Xóa oto");
            System.out.println("2.Xóa xe máy");
            System.out.println("3.Xóa xe tải");
            System.out.println("4.Quay lại");
            System.out.println("Mời nhập lựa chọn: ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập biển kiểm soát cần xóa: ");
                    iCarService.removeCar();
                    System.out.println("Xóa thành công");
                    iCarService.disPlayCar();
                    break;
                case 2:
                    iMotoBikeService.removeMotoBike();
                    System.out.println("Xóa thành công");
                    iMotoBikeService.displayMotoBike();
                    break;
                case 3:
                    iTruckService.removeTrush();
                    System.out.println("Xóa thành công");
                    iTruckService.displayTrush();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
