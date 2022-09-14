package bai_tap_ngoai_2.service.impl;

import bai_tap_ngoai_2.model.Car;
import bai_tap_ngoai_2.repository.ICarRepository;
import bai_tap_ngoai_2.repository.impl.CarRepository;
import bai_tap_ngoai_2.service.ICarService;

import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static Scanner scanner = new Scanner(System.in);
    private ICarRepository iCarRepository = new CarRepository();

    @Override
    public void addCar() {
        Car car = this.inforCar();
        iCarRepository.addCar(car);
    }

    @Override
    public void removeCar() {
        List<Car> carList = iCarRepository.getAll();
        String removeStudent = scanner.nextLine();
        for (int index = 0; index < carList.size(); index++) {
            if (removeStudent.equals(carList.get(index).getBienKiemSoat())) {
                carList.remove(index);
            }return;
        }
    }

    @Override
    public void disPlayCar() {
        List<Car> carList = iCarRepository.getAll();
        for (Car car : carList) {
            System.out.println(car);
        }
    }

        @Override
        public void searchCar (String biensoxe) {
            List<Car>carList=iCarRepository.getAll();
            for (Car car:carList) {
                if (car.getBienKiemSoat().equals(biensoxe)) {
                    System.out.println(car);
                }
            }
        }
         Car inforCar () {
            System.out.println("Nhập biển kiểm soát: ");
            String biensoxe = scanner.nextLine();
            System.out.println("Nhập tên hãng: ");
            String tenhangxe = scanner.nextLine();
            System.out.println("Nhập năm sản xuất: ");
            long namsanxuat = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập chủ sở hữu: ");
            String chusohuu = scanner.nextLine();
            System.out.println("Nhập số chỗ ngồi: ");
            int sochongoi = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập kiểu xe: ");
            String kieuxe = scanner.nextLine();
            Car car = new Car(biensoxe, tenhangxe, namsanxuat, chusohuu, sochongoi, kieuxe);
            return car;
        }
    }

