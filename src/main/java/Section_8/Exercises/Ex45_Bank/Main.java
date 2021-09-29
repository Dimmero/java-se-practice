package Section_8.Exercises.Ex45_Bank;

public class Main {
    public static void main(String[] args) {
    Bank bank = new Bank("NBP");
    bank.addBranch("Nowa Huta");
    bank.addCustomer("Nowa Huta", "Dima", 100.05);
    bank.addCustomer("Nowa Huta", "Marina", 143.05);
    bank.addCustomer("Nowa Huta", "Karol", 14.05);

    bank.addBranch("Biezanow");
    bank.addCustomer("Biezanow", "Peter", 220);

    bank.addCustomerTransaction("Nowa Huta", "Dima", 44.22);
    bank.addCustomerTransaction("Nowa Huta", "Peter", 12.22);
    bank.addCustomerTransaction("Nowa Huta", "Tom", 1.22);

    bank.listCustomers("Nowa Huta", true);
    bank.listCustomers("Biezanow", true);

    bank.addBranch("Minsk");
    if (!bank.addCustomer("Minsk", "Kolia", 2333)){
        System.out.println("Error");
    }



    }

}
