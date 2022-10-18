package pass2.write_read;

import pass2.model.Benhnhanthuong;
import pass2.model.Benhnhanvip;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadThuong {
    public List<Benhnhanthuong> readFileThuong(String filePath) {
        List<Benhnhanthuong> benhnhanthuongList = new ArrayList<>();
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
                String phinamvien = temp[6];
                Benhnhanthuong benhnhanthuong = new Benhnhanthuong(sothutu, mabenhan, tenbenhnhan, ngaynhapvien, ngayravien, lydonhapvien,phinamvien);
                benhnhanthuongList.add(benhnhanthuong);
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
        return benhnhanthuongList;
    }

    public void writeFileThuong(List<Benhnhanthuong> benhnhanthuongList, String filePath) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = "";
            for (Benhnhanthuong benhnhanthuong : benhnhanthuongList) {
                str += benhnhanthuong.getSothutu() + "," + benhnhanthuong.getMabenhan() + "," + benhnhanthuong.getTenbenhnhan() + "," + benhnhanthuong.getNgaynhapvien() + "," +
                        benhnhanthuong.getNgayravien() + "," + benhnhanthuong.getLydonhapvien() + "," + benhnhanthuong.getPhinamvien()+ "\n";
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
