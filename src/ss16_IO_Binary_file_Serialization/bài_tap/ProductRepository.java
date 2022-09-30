package ss16_IO_Binary_file_Serialization.bài_tap;

import java.util.List;

public class ProductRepository {
    String FILE_NAME="C:\\code gym\\Module 2\\module2\\src\\ss16_IO_Binary_file_Serialization\\bài_tap\\product.dat";
    ReadAndWriteProduct readAndWriteProduct=new ReadAndWriteProduct();
    List<Product>productList=readAndWriteProduct.readFile(FILE_NAME);
    public void add(Product product) {
        productList.add(product);
        readAndWriteProduct.writeFile(productList,FILE_NAME);
    }
}
