package ss15_IO_TEXT_FILe.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class tong_so_trong_file {
  public void readFileText (String filePath) {
      try {
          File file=new File(filePath);
          if (!file.exists()) {
              throw new FileNotFoundException();
          }
          BufferedReader br=new BufferedReader(new FileReader(file));
          String line="";
          int sum=0;
          while ((line=br.readLine())!=null) {
              System.out.println(line);
              sum+=Integer.parseInt(line);
          }
          br.close();
          System.out.println("Tổng= "+sum);
      } catch (Exception e) {
          System.out.println("File ko tồn tại or có lỗi");
      }
  }

    public static void main(String[] args) {
//        System.out.println("Nhập đường dẫn file: ");
//        Scanner scanner=new Scanner(System.in);
//        String path=scanner.nextLine();
        tong_so_trong_file readFile=new tong_so_trong_file();
        readFile.readFileText("C:\\code gym\\Module 2\\module2\\src\\ss15_IO_TEXT_FILe\\thuc_hanh\\text");
    }
}
