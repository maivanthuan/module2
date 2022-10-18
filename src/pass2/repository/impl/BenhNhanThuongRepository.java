package pass2.repository.impl;

import pass2.model.Benhnhanthuong;
import pass2.model.Benhnhanvip;
import pass2.repository.IBenhNhanThuongRepository;
import pass2.write_read.WriteAndReadThuong;
import pass2.write_read.WriteAndReadVip;

import java.util.List;

public class BenhNhanThuongRepository implements IBenhNhanThuongRepository {
    WriteAndReadThuong writeAndReadThuong=new WriteAndReadThuong();
    List<Benhnhanthuong>benhnhanthuongList=writeAndReadThuong.readFileThuong(FILENAME_THUONG);
    @Override
    public void addBenhnhanthuong(Benhnhanthuong benhnhanthuong) {
        benhnhanthuongList.add(benhnhanthuong);
        writeAndReadThuong.writeFileThuong(benhnhanthuongList,FILENAME_THUONG);
    }

    @Override
    public void remove(Benhnhanthuong benhnhanthuong) {
        benhnhanthuongList.remove(benhnhanthuong);
        writeAndReadThuong.writeFileThuong(benhnhanthuongList,FILENAME_THUONG);
    }

    @Override
    public List<Benhnhanthuong> findAll() {
        return benhnhanthuongList;
    }
}
