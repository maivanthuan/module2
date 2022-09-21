package ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.controller;

import ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.service.IProductService;
import ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.service.impl.ProductService;

import java.util.Scanner;

public class Sort {
    public IProductService iProductService=new ProductService();
    public void menuSort() {
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("1.Tăng dần");
            System.out.println("2.Giảm dần");
            System.out.println("Chọn chức năng");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.sortProductt();
                    break;
                case 2:
                    iProductService.sortProductg();
                    break;
            }
        }while (true);

    }
}
