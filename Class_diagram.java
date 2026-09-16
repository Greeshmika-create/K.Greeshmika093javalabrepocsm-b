import java.util.Scanner;
class customer{
	String name;
	int customerID;
	
	void input1(Scanner s){
		System.out.println("Enter customer name: ");
		name = s.nextLine();
		System.out.println("Enter customer ID: ");
		customerID = s.nextInt();
		s.nextLine();
	}
	
	void displayCustomer(){
		System.out.println("Customer name: " + name);
		System.out.println("Customer ID: " + customerID);
	}
}

class order{
	int orderID;
	String product;
	
	void input2(Scanner s){
		System.out.println("Enter order ID: ");
		orderID = s.nextInt();
		s.nextLine();
		System.out.println("Enter product: ");
		product = s.nextLine();
	}
}

class specialOrder extends order{
	String ordername;
	
	void input3(Scanner s){
		input2(s);
		System.out.println("Enter special order name: ");
		ordername = s.nextLine();
	}
	
	void displaySpecialOrder(){
		System.out.println("Special order: " + ordername);
		System.out.println("Order ID: " + orderID);
		System.out.println("Product: " + product);
	}
}

class normalOrder extends order{
	String Deliverydate;
	
	void input4(Scanner s){
		input2(s);
		System.out.println("Enter delivery date: ");
		Deliverydate = s.nextLine();
	}
	
	void displaynormalOrder(){
		System.out.println("Delivery date: " + Deliverydate);
		System.out.println("Order ID: " + orderID);
		System.out.println("Product: " + product);
	}
}

public class Class_diagram{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		customer c = new customer();
				
		int choice;
		do{
			System.out.println("1.Special order 2.Normal order 3.Exit: ");
			Scanner ch = new Scanner(System.in);
			choice = ch.nextInt();
			switch(choice){
				case 1:
					specialOrder so = new specialOrder();
					c.input1(s);
					so.input3(s);
					System.out.println("Special order details: ");
					c.displayCustomer();
					so.displaySpecialOrder();
					break;
				case 2:
					normalOrder no = new normalOrder();
					c.input1(s);
					no.input4(s);
					System.out.println("Normal order details: ");
					c.displayCustomer();
					no.displaynormalOrder();
					break;
				case 3:
					System.out.println("Thank you");
					break;
				default:
					System.out.println("Invalid choice");
			}
		}while(choice!=3);
	}
}