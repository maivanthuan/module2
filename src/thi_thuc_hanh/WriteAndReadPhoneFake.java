package thi_thuc_hanh;

import thi_thuc_hanh.Model.PhoneFake;
import thi_thuc_hanh.Model.PhoneReal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadPhoneFake {
    public List<PhoneFake> readFilePhoneFake(String filePath) {
        List<PhoneFake> phoneFakeList =new ArrayList<>();
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
                String quocgaixachtay = temp[5];
                String trangthai = temp[6];
                PhoneFake phoneFake = new PhoneFake(id, tensanpham, gia, soluong, nhasanxuat, quocgaixachtay, trangthai);
                phoneFakeList.add(phoneFake);
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
        return phoneFakeList;
    }
    public void writeFilePhoneFake(String filePath,List<PhoneFake>phoneFakeList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = "";
            for (PhoneFake phoneFake : phoneFakeList) {
                str += phoneFake.getId() + "," + phoneFake.getTensanpham() + "," + phoneFake.getGia() + "," + phoneFake.getSoluong() + "," +
                        phoneFake.getNhasanxuat() + "," + phoneFake.getQuocgiaxachtay() + "," + phoneFake.getTrangthai() + "\n";
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
