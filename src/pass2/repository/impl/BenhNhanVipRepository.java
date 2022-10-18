package pass2.repository.impl;

import pass2.model.Benhnhanvip;
import pass2.repository.IBenhNhanVipRepository;
import pass2.write_read.WriteAndReadVip;

import java.util.List;

public class BenhNhanVipRepository implements IBenhNhanVipRepository {
    WriteAndReadVip writeAndReadVip=new WriteAndReadVip();
        List<Benhnhanvip>benhnhanvipList=writeAndReadVip.readFileVip(FILENAME_VIP);
    @Override
    public void addBenhnhanvip(Benhnhanvip benhnhanvip) {
        benhnhanvipList.add(benhnhanvip);
        writeAndReadVip.writeFileVip(benhnhanvipList,FILENAME_VIP);

    }

    @Override
    public void remove(Benhnhanvip benhnhanvip) {
        benhnhanvipList.remove(benhnhanvip);
        writeAndReadVip.writeFileVip(benhnhanvipList,FILENAME_VIP);
    }
    @Override
    public List<Benhnhanvip> findAll() {
        return benhnhanvipList;
    }
}
