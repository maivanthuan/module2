package ss16_IO_Binary_file_Serialization.bài_tap;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        ProductService productService=new ProductService();
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("1.Thêm sản phẩm mới");
            System.out.println("2.Hiển thị sản phẩm");
            System.out.println("3.Tìm kiếm thông tin sản phẩm");
            System.out.println("4.Thoát");
            System.out.println("Mời chọn chức năng");
            int choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    productService.add();
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    productService.display();
                    break;
                case 3:
                    System.out.println("Nhập mã sản phẩm cần tìm");
                    int num=scanner.nextInt();
                    productService.find(num);
                    break;
                case 4:
                    System.exit(0);
            }

        }while (true);
    }
}
