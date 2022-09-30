package ss15_IO_TEXT_FILe.bai_tap.doc_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static final String FILE_NAME = "C:\\code gym\\Module 2\\module2\\src\\ss15_IO_TEXT_FILe\\bai_tap\\doc_file\\countries";

    public static List<Country> readFile() {
        List<Country> countryList = new ArrayList<>();
        String line;
        try {
            FileReader fileReader=new FileReader(FILE_NAME);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null) {
                String[]temp=line.split(",");
                String id=temp[0];
                String code=temp[1];
                String name=temp[2];
                countryList.add(new Country(id,code,name));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File ko tồn tại hoặc lỗi");
        }
        return countryList;
    }

    public static void main(String[] args) {
        List<Country>countryList=main.readFile();
        for (Country country:countryList) {
            System.out.println(country);
        }
    }
}
