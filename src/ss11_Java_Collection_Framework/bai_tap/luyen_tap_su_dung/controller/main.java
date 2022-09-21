package ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.controller;

import ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.service.IProductService;
import ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.service.impl.ProductService;

import java.util.Scanner;

public class main {
    private static final IProductService iProductService = new ProductService();
    static Sort sort=new Sort();

    public static void main(String[] args) {
        do {
        Scanner scanner = new Scanner(System.in);
            System.out.println("CHÀO MỪNG BẠN ĐẾN TRÌNH QUẢN LÝ ĐIỆN THOẠI");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm");
            System.out.println("3.Xóa sản phẩm");
            System.out.println("4.Hiển thị danh sách sản phẩn");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7.Thoát chương trình");
            System.out.println("Nhập số để chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    System.out.println("Nhập mã sản phẩm cần thay đổi: ");
                    String code = scanner.nextLine();
                    iProductService.changeProduct(code);
                    break;
                case 3:
                    System.out.println("Nhập mã sản phẩm cần xóa: ");
                    String index = scanner.nextLine();
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.displayProduct();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm: ");
                    String nameproduct = scanner.nextLine();
                    iProductService.searchProduct(nameproduct);
                    break;
                case 6:
                    sort.menuSort();
                    break;
                case 7:
                    System.exit(0);
            }
        }while (true);
    }
}
