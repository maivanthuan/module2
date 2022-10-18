package thi_thuc_hanh.Repository;

import ss16_IO_Binary_file_Serialization.bài_tap.Product;
import thi_thuc_hanh.Model.PhoneReal;
import thi_thuc_hanh.WriteAndReadPhoneReal;

import java.util.List;

public class PhoneRealRepository implements IPhoneRealRepository {
    String FILE_PHONEREAL="C:\\code gym\\Module 2\\module2\\src\\thi_thuc_hanh\\PhoneReal.csv";
    WriteAndReadPhoneReal writeAndReadPhoneReal=new WriteAndReadPhoneReal();
    List<PhoneReal>phoneRealList=writeAndReadPhoneReal.readFilePhoneReal(FILE_PHONEREAL);
    @Override
    public void add(PhoneReal phoneReal) {
        phoneRealList.add(phoneReal);
        writeAndReadPhoneReal.writeFilePhoneReal(FILE_PHONEREAL,phoneRealList);

    }

    @Override
    public void remove(PhoneReal phoneReal) {
        phoneRealList.remove(phoneReal);
        writeAndReadPhoneReal.writeFilePhoneReal(FILE_PHONEREAL,phoneRealList);
    }

    @Override
    public List<PhoneReal> getAll() {
        return phoneRealList;
    }
}
