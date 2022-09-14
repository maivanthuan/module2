package bai_tap_ngoai_2.controller;

import bai_tap_ngoai_2.service.ICarService;
import bai_tap_ngoai_2.service.IMotoBikeService;
import bai_tap_ngoai_2.service.ITruckService;
import bai_tap_ngoai_2.service.impl.CarService;
import bai_tap_ngoai_2.service.impl.MotoBikeService;
import bai_tap_ngoai_2.service.impl.TruckService;

import java.util.Scanner;

public class SearchCarController {
    private static Scanner scanner=new Scanner(System.in);
    private static final ICarService iCarService=new CarService();
    private static final IMotoBikeService iMotoBikeService=new MotoBikeService();
    private static final ITruckService iTruckService= new TruckService();
    public static void searchMenu() {
        do {
            System.out.println("1.Tìm xe oto");
            System.out.println("2.Tìm xe tải");
            System.out.println("3.Tìm xe máy");
            System.out.println("4.Thoát");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("NHập vào biển số xe: ");
                    String biensoxe=scanner.nextLine();
                    iCarService.searchCar(biensoxe);
                    break;
                case 2:
                    System.out.println("NHập vào biển số xe: ");
                    String biensoxe1=scanner.nextLine();
                    iMotoBikeService.searchMotoBike(biensoxe1);
                    break;
                case 3:
                    System.out.println("NHập vào biển số xe: ");
                    String biensoxe2=scanner.nextLine();
                    iTruckService.searchTruck(biensoxe2);
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
