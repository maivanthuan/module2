package ss15_IO_TEXT_FILe.thuc_hanh;

import bai_tap_ngoai_2.controller.RemoveController;
import ss6_ke_thua.bai_tap.Point_moveablePoint.Point;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class time_GIA_tri_lon_nhat {
    public List<Integer> readFile(String filePath) {
        List<Integer>numbers=new ArrayList<>();
    try {
        File file=new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        BufferedReader br= new BufferedReader(new FileReader(file));
        String line="";
        while ((line=br.readLine())!=null) {
            numbers.add(Integer.parseInt(line));
        }
        br.close();
    }catch (Exception e) {
        System.out.println("Không có file or bị lỗi");
    }
    return numbers;
    }
    public static void writeFile(String filePath, int max) {
        try {
            FileWriter writer=new FileWriter(filePath, true);
            BufferedWriter bufferedWriter= new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất: "+max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findmax(List<Integer>numbers) {
        int max=numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        time_GIA_tri_lon_nhat time_gia_tri_lon_nhat=new time_GIA_tri_lon_nhat();
        List<Integer>numbers=time_gia_tri_lon_nhat.readFile("C:\\code gym\\Module 2\\module2\\src\\ss15_IO_TEXT_FILe\\thuc_hanh\\dấd");
        int maxvalue=findmax(numbers) ;
            time_gia_tri_lon_nhat.writeFile("C:\\code gym\\Module 2\\module2\\src\\ss15_IO_TEXT_FILe\\thuc_hanh\\text", maxvalue);
        System.out.println("finish");
        }
    }


