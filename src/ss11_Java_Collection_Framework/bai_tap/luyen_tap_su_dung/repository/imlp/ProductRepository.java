package ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.repository.imlp;

import ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.model.Product;
import ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    @Override
    public void addProduct(Product product) {
        list.add(product);
    }
    @Override
    public List<Product> getAll() {
        return list;
    }
   public static List<Product>list =new ArrayList<>();
    static {
        list.add(new Product("123","iphone 10","apple",10000000));
        list.add(new Product("124","iphone 14 pro max","apple",40000000));
        list.add(new Product("125","Galaxy Z Fold4","samsung",32000000));
        list.add(new Product("126"," Galaxy A53","samsung",13000000));
    }
}
