package testrun;

public class Customer {

    public  String firstName;
    private String lastName;
    private String email;
    private String sinNumber;
    private String phone;
    private Address address;

    //Constructor - initialize the object
    public Customer(String firstName, String lastName, String email, String sinNumber, String phone, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.sinNumber = sinNumber;
        this.phone = phone;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSinNumber() {
        return sinNumber;
    }

    public void setSinNumber(String sinNumber) {
        this.sinNumber = sinNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", sinNumber='" + sinNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                '}';
    }
}
