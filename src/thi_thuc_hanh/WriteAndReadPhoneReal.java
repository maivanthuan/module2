package thi_thuc_hanh;

import thi_thuc_hanh.Model.PhoneReal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadPhoneReal {
        public List<PhoneReal> readFilePhoneReal(String filePath) {
        List<PhoneReal> phoneRealList =new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String tensanpham = temp[1];
                double gia = Double.parseDouble(temp[2]);
                int soluong = Integer.parseInt(temp[3]);
                String nhasanxuat = temp[4];
                String thoigianbaohanh = temp[5];
                String phamvibaohanh = temp[6];
                PhoneReal phoneReal = new PhoneReal(id, tensanpham, gia, soluong, nhasanxuat, thoigianbaohanh, phamvibaohanh);
                phoneRealList.add(phoneReal);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return phoneRealList;
}
    public void writeFilePhoneReal(String filePath,List<PhoneReal>phoneRealList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = "";
            for (PhoneReal phoneReal : phoneRealList) {
                str += phoneReal.getId() + "," + phoneReal.getTensanpham() + "," + phoneReal.getGia() + "," + phoneReal.getSoluong() + "," +
                        phoneReal.getNhasanxuat() + "," + phoneReal.getThoigianbaohanh() + "," + phoneReal.getPhamvibaohanh() + "\n";
            }
            if (str != null && !str.isEmpty()) {
                bufferedWriter.write(str);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }

        }
    }
}
