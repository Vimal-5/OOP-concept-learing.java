import java.util.Scanner;

class BankAccount{
    
    private int acc_no;
    private String name;
    private double balance;
    
    public void setAcc_No(int acc_no){
        this.acc_no=acc_no;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBalance(double balance){
        if(balance >=0){
            this.balance=balance;
        }
        else{
            System.out.println("The balance is Invalid.");
        }
    }
    
    public long getAcc_No(){
        return acc_no;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    
}

class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        BankAccount ba = new BankAccount();
        
        System.out.println("Enter the account number: ");
        int Acc_No = obj.nextInt();
        ba.setAcc_No(Acc_No);
        obj.nextLine();
        
        System.out.println("Enter the name: ");
        String Name = obj.nextLine();
        ba.setName(Name);
        
        System.out.println("Enter the balance: ");
        double Balance = obj.nextDouble();
        ba.setBalance(Balance);
        
        System.out.println("Account Number: "+ba.getAcc_No());
        System.out.println("Name: "+ba.getName());
        System.out.println("Balance: "+ba.getBalance());
        
    }
}
