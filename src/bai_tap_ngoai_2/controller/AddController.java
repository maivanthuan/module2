package bai_tap_ngoai_2.controller;

import bai_tap_ngoai_2.service.ICarService;
import bai_tap_ngoai_2.service.IMotoBikeService;
import bai_tap_ngoai_2.service.ITruckService;
import bai_tap_ngoai_2.service.impl.CarService;
import bai_tap_ngoai_2.service.impl.MotoBikeService;
import bai_tap_ngoai_2.service.impl.TruckService;

import java.util.Scanner;

public class AddController {
    private static final Scanner scanner=new Scanner(System.in);
    private static final ICarService iCarService= new CarService();
    private static final IMotoBikeService iMotoBikeService=new MotoBikeService();
    private static final ITruckService iTruckService=new TruckService();
    public static void addMenu() {
        do {
            System.out.println("1.Thêm oto");
            System.out.println("2.Thêm xe máy");
            System.out.println("3.Thêm xe tải");
            System.out.println("4.Quay lại");
            System.out.println("NHập vào lựa chọn: ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iCarService.addCar();
                    break;
                case 2:
                    iMotoBikeService.addMotoBike();
                    break;
                case 3:
                    iTruckService.addTrush();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
