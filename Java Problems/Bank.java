//data hiding in java

class BankAccount {
    private double balance; 
        
    public BankAccount(double initialBalance){
        balance =initialBalance;
    }
    public void deposit(double amount){
        balance+=amount;
       

    }
    public void withdrow(double amount){
        balance-=amount;
    }
    //
    void setBalance(double newBalance){
        balance=newBalance;
    }
    public void display(){
        System.out.println(balance);
    }
}
public class Bank{
    public static void main(String []args){
        BankAccount b=new BankAccount(4000);
        b.setBalance(4000);
        b.deposit(400);
        b.withdrow(200);
        
        b.display();
        
    }
}
