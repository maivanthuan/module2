package pass2.write_read;

import pass2.model.Benhnhanvip;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadVip {
    public List<Benhnhanvip> readFileVip(String filePath) {
        List<Benhnhanvip> benhnhanvipList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String sothutu = temp[0];
                String mabenhan = temp[1];
                String tenbenhnhan = temp[2];
                String ngaynhapvien = temp[3];
                String ngayravien = temp[4];
                String lydonhapvien = temp[5];
                String loaivip = temp[6];
                String thoihanvip=temp[7];
                Benhnhanvip benhnhanvip = new Benhnhanvip(sothutu, mabenhan, tenbenhnhan, ngaynhapvien, ngayravien, lydonhapvien, loaivip,thoihanvip);
                benhnhanvipList.add(benhnhanvip);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return benhnhanvipList;
    }

    public void writeFileVip(List<Benhnhanvip> benhnhanvipList, String filePath) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = "";
            for (Benhnhanvip benhnhanvip : benhnhanvipList) {
                str += benhnhanvip.getSothutu() + "," + benhnhanvip.getMabenhan() + "," + benhnhanvip.getTenbenhnhan() + "," + benhnhanvip.getNgaynhapvien() + "," +
                        benhnhanvip.getNgayravien() + "," + benhnhanvip.getLydonhapvien() + "," + benhnhanvip.getLoaivip() +benhnhanvip.getThoihanvip()+ "\n";
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
