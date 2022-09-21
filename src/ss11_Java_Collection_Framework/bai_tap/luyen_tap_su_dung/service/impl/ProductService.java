package ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.service.impl;

import bai_tap_ngoai_2.model.Car;
import bai_tap_ngoai_2.service.ICarService;
import ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.model.Product;
import ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.repository.IProductRepository;
import ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.repository.imlp.ProductRepository;
import ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.service.IProductService;

import java.awt.peer.ListPeer;
import java.util.*;

public class ProductService implements IProductService {
    Scanner scanner =new Scanner(System.in);
    private IProductRepository iProductRepository=new ProductRepository();

    @Override
    public void addProduct() {
        Product product=this.infoProduct();
        iProductRepository.addProduct(product);
    }

    @Override
    public void changeProduct(String code) {
        List<Product>productList=iProductRepository.getAll();
        for (Product product:productList) {
            if(product.getCode().equals(code)) {
                do {
                    System.out.println("1.Sửa mã");
                    System.out.println("2.Sửa tên");
                    System.out.println("3.Sửa hãng");
                    System.out.println("4.Sửa giá tiền");
                    System.out.println("5.Quay lại");
                    System.out.println("Nhập lựa chọn");
                    int choice=Integer.parseInt(scanner.nextLine());
                    System.out.println(choice);
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập mã: ");
                            String newcode=scanner.nextLine();
                            product.setCode(newcode);
                            break;
                        case 2:
                            System.out.println("Nhập tên sản phẩm: ");
                            String newname=scanner.nextLine();
                            product.setName(newname);
                            break;
                        case 3:
                            System.out.println("Nhập hãng sản xuất: ");
                            String newmanufacturer=scanner.nextLine();
                            product.setManufacturer(newmanufacturer);
                            break;
                        case 4:
                            System.out.println("Nhập giá tiền: ");
                            double newprice=Double.parseDouble(scanner.nextLine());
                            product.setPrice(newprice);
                            break;
                        case 5:
                            return;
                    }
                }while (true);

            }
        }
    }

    @Override
    public void removeProduct() {
        List<Product>productList=iProductRepository.getAll();
        String removeProduct=scanner.nextLine();
        for (int index=0;index<productList.size();index++) {
            if (removeProduct.equals(productList.get(index).getCode())) {
                productList.remove(index);
            }
        }

    }

    @Override
    public void displayProduct() {
        List<Product> productList = iProductRepository.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }
    @Override
    public void searchProduct(String code) {
        List<Product>productList=iProductRepository.getAll();
        int index=productList.indexOf(new Product(code));
        for (Product product:productList) {
            if (index!=-1) {
                productList.remove(index);
            }else {
                System.out.println("Đã xóa");
            }
        }
    }

    @Override
    public void sortProductt() {
        List<Product>productList=iProductRepository.getAll();
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice()- o2.getPrice());
            }
        });
        for (Product product:productList) {
            System.out.println(product);
        }
    }

    @Override
    public void sortProductg() {
        List<Product>productList=iProductRepository.getAll();
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice()- o1.getPrice());
            }
        });
        for (Product product:productList) {
            System.out.println(product);
        }
    }

    Product infoProduct() {
        System.out.println("Nhập mã: ");
        String code=scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name=scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String manufacturer=scanner.nextLine();
        System.out.println("Nhập giá tiền: ");
        double price=Double.parseDouble(scanner.nextLine());
        Product product=new Product(code,name,manufacturer,price);
        return product;
    }
}