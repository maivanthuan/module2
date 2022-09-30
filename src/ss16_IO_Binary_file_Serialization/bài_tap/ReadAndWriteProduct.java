package ss16_IO_Binary_file_Serialization.bài_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReadAndWriteProduct {
    List<Product>productList=new ArrayList<>();
    public void writeFile(List<Product>productList,String filePath) {
        try {
            FileOutputStream fos=new FileOutputStream(filePath);
            ObjectOutputStream hihi= new ObjectOutputStream(fos);
            hihi.writeObject(productList);
            hihi.close();
        } catch (IOException e) {
            System.out.println("Lỗi file viết");;
        }
    }
    public List<Product>readFile(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream haha = new ObjectInputStream(fis);
            productList = (List<Product>) haha.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi file đọc");;
        }
        return productList;
    }
}
