package thi_thuc_hanh.Repository;

import thi_thuc_hanh.Model.PhoneFake;
import thi_thuc_hanh.Model.PhoneReal;
import thi_thuc_hanh.WriteAndReadPhoneFake;
import thi_thuc_hanh.WriteAndReadPhoneReal;

import java.util.List;

public class PhoneFakeRepository implements IPhoneFakeRepository{
    String FILE_PHONEFAKE="C:\\code gym\\Module 2\\module2\\src\\thi_thuc_hanh\\PhoneFake.csv";
    WriteAndReadPhoneFake writeAndReadPhoneFake=new WriteAndReadPhoneFake();
    List<PhoneFake>phoneFakeList=writeAndReadPhoneFake.readFilePhoneFake(FILE_PHONEFAKE);
    @Override
    public void add(PhoneFake phoneFake) {
        phoneFakeList.add(phoneFake);
        writeAndReadPhoneFake.writeFilePhoneFake(FILE_PHONEFAKE,phoneFakeList);

    }

    @Override
    public void remove(PhoneFake phoneFake) {
        phoneFakeList.remove(phoneFake);
        writeAndReadPhoneFake.writeFilePhoneFake(FILE_PHONEFAKE,phoneFakeList);

    }

    @Override
    public List<PhoneFake> getAll() {
        return phoneFakeList;
    }
}
