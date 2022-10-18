package case_study.model;

public class Customer extends Person{
    private String typeofCustomer;
    private String location;
    public Customer() {
    }

    public Customer(String id, String name, String dayOfBirth, String gender, String CMND, String phoneNumber, String email, String typeofCustomer, String location) {
        super(id, name, dayOfBirth, gender, CMND, phoneNumber, email);
        this.typeofCustomer = typeofCustomer;
        this.location = location;
    }
}
