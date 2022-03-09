import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer melih = new Customer(1,"Melih","Kahraman");
        customers.add(melih);
        customers.add(new Customer(2,"Eda","Kahraman"));
        customers.add(new Customer(3,"Mehmet","Kahraman"));

        //customers.remove(new Customer(3,"Mehmet","Kahraman"));
        customers.remove(melih);
        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
