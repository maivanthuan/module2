package ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.repository;

import ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.model.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);
  List<Product>getAll();

}
