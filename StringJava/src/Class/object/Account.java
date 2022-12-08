package Class.object;

public class Account {

    private int Id;
    private String Name;
    private double Balance;

    public Account() {
        Id = 101;
        Name = "Satyam shukla";
        Balance = 56000.45;
    }

    public void Showdata() {
        System.out.println("Id= " + Id);
        System.out.println("Name= " + Name);
        System.out.println("Balance= " + Balance);

    }

}

class useAccount {

    public static void main(String[] args) {
        Account Ac = new Account();
        System.out.println("account Details Are: ");
        Ac.Showdata();
    }
}
