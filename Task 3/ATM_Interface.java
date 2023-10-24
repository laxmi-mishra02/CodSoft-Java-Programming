import java.util.Scanner;

 class ATM
{
    private int balance;

    public ATM(int balance)
    {
        this.balance=balance;
    }
    
    public void withdraw(int amount)
    {
        if(balance>=amount){
            balance=balance-amount;
            System.out.println(amount + " withdrawn successfully");
        }
        else{
            System.out.println("Insufficient amount");
        }

    }

    public void deposit(int amount)
    {
        balance=balance+amount;
        System.out.println(amount + " deposisted successfully");
    }

    public int checkBalance(){
        return balance;
    }

}

class BankAccount{
    public static void main(String args[])
     {
        int initial_balance=100000;
        //int userID;
        int pin=1997;

        Scanner sc=new Scanner(System.in);
        ATM atm=new ATM (initial_balance);

        System.out.print("Enter pin: ");
        int pin_no=sc.nextInt();

        if(pin==pin_no){
            while(true){
                System.out.println("Welcome to the ATM!");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("choose the operation you want to perform: ");
                int option=sc.nextInt();

                switch(option){
                    case 1:
                        System.out.println("Enter amount to withdraw:");
                        int amount=sc.nextInt();
                        atm.withdraw(amount);
                        break;

                    case 2:
                        System.out.println("Enter amount to deposit:");
                        amount=sc.nextInt();
                        atm.deposit(amount);
                        break;

                    case 3:
                        System.out.println("Current Balance:"+atm.checkBalance());
                        break;
                    
                    case 4:
                        System.out.println("Thank you for using the ATM");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid option! Please try again.");
                    
                
                }   
            
            }
        }
        else{
            System.out.println("Incorrect pin");
            }
        sc.close();
    }

}