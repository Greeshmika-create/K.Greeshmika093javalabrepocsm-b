import java.util.Scanner;

class Bank{
	private int account_number;
	private String account_holder_name;
	private int balance;
	int amount;

	int getBalance(){
		return balance;
	}
	
	void setAN(int n){
		account_number = n;
	}
	
	void setAHN(String n){
		account_holder_name = n;
	}
	
	void setB(int b){
		balance = b;
	}
	
	void deposit(){
		System.out.println("Amount to be deposited: ");
		Scanner sc = new Scanner (System.in);
		amount = sc.nextInt();
		if(amount<=0)
			System.out.println("Invalid amount to be deposited");
		else{
			balance = balance + amount;
			System.out.println("Present amount in account is " + balance);
		}
	}
		
	void withdraw(){
		System.out.println("Amount to be withdrawn: ");
		Scanner sc = new Scanner (System.in);
		amount = sc.nextInt();
		if(amount>0 && amount<=balance){
			balance = balance-amount;
			System.out.println("Present amount in account is " + balance);
		}
		else
			System.out.println("Invalid amount to be withdrawn");
	}
		
	void display(){
		System.out.println("Account number: " + account_number);
		System.out.println("Account holder name: " + account_holder_name);
		System.out.println("Balance: " + balance);
	}
}

class SavingsAccount extends Bank{
	int rate = 5;
	
	void calculateInterest(){
		float interest;
		interest = getBalance() * rate / 100;
		System.out.println("Interest in svaings account is: " + interest);
	}
}

class CurrentAccount extends Bank{
	int rate = 6;
	
	void calculateInterest(){
		float interest;
		interest = getBalance() * rate / 100;
		System.out.println("Interest in current account is: " + interest);
	}
}

public class Banking{
	public static void main(String[] args){
		SavingsAccount s = new SavingsAccount();
		CurrentAccount c = new CurrentAccount();
		Scanner an = new Scanner (System.in);
		Scanner ahn = new Scanner(System.in);
		Scanner b = new Scanner (System.in);
		int chooseAccount;
		do{
			System.out.println("1.Savings Account , 2.Current Account , 3.Exit: ");
			Scanner sw1 = new Scanner(System.in);
			chooseAccount = sw1.nextInt(); 
			switch(chooseAccount){
				case 1:
				System.out.println("Savings Account");
				System.out.println("Enter account number: ");
				s.setAN(an.nextInt());
			
				System.out.println("Enter account holder name: ");
				s.setAHN(ahn.nextLine());
				
				System.out.println("Enter balance in account: ");
				s.setB(b.nextInt());
				
				int op1;
				do{
					System.out.println("1.Deposit , 2.Withdrawal , 3.Interest , 4.Display , 5.Exit: ");
					Scanner sw2 = new Scanner(System.in);
					op1 = sw2.nextInt();
					switch(op1){
						case 1:
							s.deposit();
							break;
						case 2:
							s.withdraw();
							break;
						case 3:
							s.calculateInterest();
							break;
						case 4:
							s.display();
							break;
						case 5:
							System.out.println("Thank you");
							break;

						default:
							System.out.println("Invalid choice");
					}
				}while(op1!=5);
				break;
				
				case 2:
					System.out.println("Current Account");
					System.out.println("Enter account number: ");
					c.setAN(an.nextInt());
					
					System.out.println("Enter account holder name: ");
					c.setAHN(ahn.nextLine());
					
					System.out.println("Enter balance in account: ");
					c.setB(b.nextInt());
					int op2;
					do{
						System.out.println("1.Deposit , 2.Withdrawal , 3.Interest , 4.Display , 5.Exit: ");
						Scanner sw3 = new Scanner(System.in);
						op2 = sw3.nextInt();
						switch(op2){
							case 1:
								c.deposit();
								break;
							case 2:
								c.withdraw();
								break;
							case 3:
								c.calculateInterest();
								break;
							case 4:
								c.display();
								break;
							case 5:
								System.out.println("Thank you");
								break;

							default:
								System.out.println("Invalid choice");
						}
					}while(op2!=5);
					break;
				
				case 3:
					System.out.println("Thank you");
					break;

				default:
					System.out.println("Invalid choice");
			}
		}while(chooseAccount!=3);
	}
}