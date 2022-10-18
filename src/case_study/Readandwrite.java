package case_study;

import case_study.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Readandwrite {
    public static int writeFile;
    List<Customer> customerList=new ArrayList<>();
    public static void writeFile(List<Customer> customerList, String filePath) {
        try {
            FileOutputStream fos=new FileOutputStream(filePath);
            ObjectOutputStream hihi= new ObjectOutputStream(fos);
            hihi.writeObject(customerList);
            hihi.close();
        } catch (IOException e) {
            System.out.println("Lỗi file viết");;
        }
    }
    public List<Customer>readFile(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream haha = new ObjectInputStream(fis);
            customerList = (List<Customer>) haha.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi file đọc");;
        }
        return customerList;
    }
}
