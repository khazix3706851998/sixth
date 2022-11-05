package account;

public class Account {
    protected int id;
    protected double balance;
    protected double annualInterestTate;
    public Account(){
        int a =2;
    }
    public Account(int id,double balance,double annualInterestTate){
        super();
        this.id=id;
        this.balance=balance;
        this.annualInterestTate=annualInterestTate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestTate() {
        return annualInterestTate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestTate(double annualInterestTate) {
        this.annualInterestTate = annualInterestTate;
    }
    public double getMonthlyTerest(){
        return annualInterestTate/12;
    }
    public void withdraw(double account){
        if(this.balance>=account){
            balance-=account;
        }else System.out.println("余额不足！");
    }
    public void deposit(double account){
        balance+=account;
    }
}
