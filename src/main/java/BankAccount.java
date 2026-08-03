public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance ) {
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient funds!");
        }else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public void transfer(BankAccount target, double amount){
        this.withdraw(amount);
        target.deposit(amount);
        balance += amount;
        System.out.println("Transferred: " + amount);
    }

    public void printBalance(){
        System.out.println(owner + "'s balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Hemanth", 5000);
        BankAccount account2 = new BankAccount("John", 1000);
        account.printBalance();
        account2.printBalance();
        account.deposit(500);
        account.withdraw(200);
        account.transfer(account2, 500);
        account2.printBalance();

    }
}
