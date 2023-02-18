package class26;

public class Account {
   private double balance;
   private String accountNumber;
   private String type;
   private String accountTitle;

   public String getAccountTitle(){
       return accountTitle;
   }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        if(accountNumber.length()!=16){
            System.out.println("Wrong account number");
        }else{
            this.accountNumber=accountNumber;
        }

    }
    public String getAccountNumber(){
       return accountNumber;
    }

    public void setBalance(double balance){
       //initialization the input meaning checking the value before we can assign them
       if(balance<0){
           System.out.println("negative balance is not allowed ");
       }else{
           this.balance=this.balance+balance;
       }
   }
    public Account(double balance,String accountNumber, String type,String accountTitle){
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.accountTitle=accountTitle;
        this.type=type;
    }

}
class AccountTester{
    public static void main(String[] args) {
        Account acc=new Account(1000,"hdjh12","njhj","jbj");
        System.out.println(acc.getAccountTitle());
        acc.setBalance(8000);
        System.out.println(acc.getBalance());
    }
}