import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        this.id = 0;
        this.balance = 0;

    }
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    public void setId(int id){
        this.id = id;

    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate( double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public void setDateCreated( Date dateCreated){
        this.dateCreated = dateCreated;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public double getMonthlyInterestRate(){
        double answer;
        double monthlyInterestRate = (annualInterestRate /100) / 12;
        answer = balance * monthlyInterestRate;
        return answer;
    }
    public double getMonthlyInterest(){
        return (annualInterestRate/100) / 12;
    }
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        }
        else {
            System.out.println("Insufficient fund");
        }
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
        else {
            System.out.println("You can't deposit less than 0");
        }
    }

}
