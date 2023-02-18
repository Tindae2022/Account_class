public class Main {
    public static void main(String[] args) {
       Account account1 = new Account(1122, 20000, 4.5);
       account1.withdraw(2500);
       account1.deposit(3000);
       System.out.println("The balance is : le" + account1.getBalance());
        System.out.println("Monthly Interest is : le" + account1.getMonthlyInterest());
        System.out.println("Monthly Interest Rate : le" + account1.getMonthlyInterestRate());
    }
}