package ss15_IO_TEXT_FILe.bai_tap.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class copy_file {
    public static List<String>readFile(String filePath) {
        List<String>stringList=new ArrayList<>();
        try {
            File file=new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line=bufferedReader.readLine())!=null) {
                stringList.add(line);
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File ko tồn tại or lỗi");;
        }
        return stringList;
    }
    public static void writefile(String filePath, List<String>data) throws IOException {
        FileWriter fileWriter=new FileWriter(filePath);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (String string:data) {
            bufferedWriter.write(string);
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
    }

    public static void main(String[] args) throws IOException {
        List<String>stringList=copy_file.readFile("C:\\code gym\\Module 2\\module2\\src\\ss15_IO_TEXT_FILe\\bai_tap\\copy_file\\data");
        writefile("C:\\code gym\\Module 2\\module2\\src\\ss15_IO_TEXT_FILe\\bai_tap\\copy_file\\result",stringList);
    }
}
