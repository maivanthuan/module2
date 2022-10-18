package case_study.Repository;

import case_study.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    void add(Customer customer);
    List<Customer>getAll();
}
