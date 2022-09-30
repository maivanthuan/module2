package ss16_IO_Binary_file_Serialization.bài_tap;

import java.util.Scanner;

public class ProductService {
    ProductRepository productRepository=new ProductRepository();
    Product product=new Product();
    Scanner scanner=new Scanner(System.in);
    public void add() {
        System.out.println("Nhập mã sản phẩm");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập tên xản phẩm");
        product.setName(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất");
        product.setManufacturer(scanner.nextLine());
        System.out.println("Nhập giá");
        product.setPrice(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập thông tin khác");
        product.setOther(scanner.nextLine());
        productRepository.add(product);
    }
    public void display() {
        for (Product product: productRepository.productList) {
            System.out.println(product);
        }
    }
    public void find(int id) {
        Product product1=new Product();
        for (Product product: productRepository.productList){
            if (product.getId()==id) {
                product1=product;
            }
        }
        int index=productRepository.productList.indexOf(product1);
        if (index!=-1) {
            System.out.println(product1);
        }else {
            System.out.println("Not Found");
        }
    }

}
