package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name= name;
        this.customers= new ArrayList<>();
    }

    public void addCustomer(String customerName) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName));
        }
    }

    public Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public void addTransaction(String customerName, double amount) {
        Customer customer= findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(amount);
        }
    }

    public void printStatement(String customerName) {
        Customer customer= findCustomer(customerName);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }
        System.out.println("Bank: " + name);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Transactions:");
        int k= 1;
        for (Double transaction : customer.getTransactions()) {
            double amount= transaction; // Unboxing
            System.out.println(k + ". " + amount);
            k++;
        }
    }
}