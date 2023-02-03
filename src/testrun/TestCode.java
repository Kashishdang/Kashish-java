package testrun;

public class TestCode {
    public static void main(String[] args) {

      //  int y; // declaration
       // int x = 10; // initialization


        Address address = new Address("100 Jayzel drive","North york village",
                "M9M 2B3","Toronto", "ON","Canada");

        Customer customer1 = new Customer("Kashish","Dang","kkashish.dang@gmail.com","946256478",
                "437-262-5700", address);

        Customer customer2 = new Customer("Atin","Singh","Atin@gmail.com","946256478",
                "437-262-5700", address);

        Customer customer3 = new Customer("Vivek","Ghartan","vivek@gmail.com","946256478",
                "437-262-5700", address);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
    }
}

/* steps : create customer class
added fields
2. create constructor
3. getter setter
4. toString() -- to print on console nicely

same for address

created object for address and created object for customer
passed values to it



 */
