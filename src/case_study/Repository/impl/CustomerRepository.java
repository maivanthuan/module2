package case_study.Repository.impl;

import case_study.Repository.ICustomerRepository;
import case_study.model.Customer;
import case_study.Readandwrite;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    String FILE_NAME="C:\\code gym\\Module 2\\module2\\src\\case_study\\Data\\customer.dat";
    Readandwrite readandwrite=new Readandwrite();
    List<Customer> customerList =readandwrite.readFile(FILE_NAME);
    @Override
    public void add(Customer customer) {
        customerList.add(customer);
        Readandwrite.writeFile(customerList,FILE_NAME);
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }
}
