package arraylistWithClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();

        Customer hüseyin=new Customer(1,"Hüseyin","Şirikçi");
        customers.add(hüseyin);
        customers.add(new Customer(2,"Kaan","Şirikçi"));
        customers.add(new Customer(3,"simay","Şirikçi"));

        customers.remove(hüseyin);
        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }

    }
}
