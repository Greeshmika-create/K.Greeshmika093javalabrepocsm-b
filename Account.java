class Account
{
  int accountNumber;
  String customerName;
  double balance;
  String accountType;

  Account(int accNo, String name, double bal,String type)
  {
        accountNumber = accNo;
        customerName = name;
        balance = bal;
        accountType = type;
  }

  void deposit(double amount)
  {
      balance = balance + amount;
      System.out.println(amount + " deposited successfully.");

  }

  void withdraw(double amount)
  {
    if(balance>=amount)
    {
        balance = balance - amount;
         System.out.println(amount + " withdrawn successfully.");

    }
    else
    {
         System.out.println("Insufficient balance.");
    }
  }

  void transfer(Account receiver ,double amount)
  {
    if(balance >= amount)
    {
        balance = balance - amount;
        receiver.balance= receiver.balance + amount;
        System.out.println(amount + "transferred to" + receiver.customerName);
    
    }
    else
    {
        System.out.println("transfer failed.");
    }
  }

   void display()
   {
        System.out.println("......................");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance : " + balance);


   }
}
class SavingsAccount extends Account
    {
        double interestRate;
        SavingsAccount(int accNo, String name, double bal, double rate)
    {
        super(accNo, name, bal,"saving");
        interestRate = rate;
    }
    void calculateInterest()
    {
        double interest = balance * interestRate / 100;
        System.out.println("Interest =" + interest);
    }
    
    void display()
    {
    super.display();
    System.out.println("Interest Rate = " + interestRate + "%");
 }
}

