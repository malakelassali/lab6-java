package problem2;

public class Test {
    public static void main(String[] args) {
        Bank bank= new Bank("Attijariwafa Bank");

        bank.addCustomer("Amal");
        bank.addCustomer("Samir");
        bank.addCustomer("Amal"); // Duplicate

        bank.addTransaction("Amal", 1000);
        bank.addTransaction("Amal", -200);
        bank.addTransaction("Samir", 2000);
        bank.addTransaction("Samir", -500);

        bank.printStatement("Amal");
        System.out.println();
        bank.printStatement("Samir");
        System.out.println();

        bank.printStatement("Youssef"); // Nonexistent customer
    }
}