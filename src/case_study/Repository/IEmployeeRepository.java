package case_study.Repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void add(Employee employee);
    List<Employee>getAll();
}
