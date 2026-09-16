import java.util.Scanner;
class Employee{
	String name;
	int ID;
	String designation;
	String promotionstatus;
	double salary;
	
	Employee(String name,int ID){
		this.name = name;
		this.ID = ID;
	}
	
	Employee(String name,int ID,String designation){
		this.name = name;
		this.ID = ID;
		this.designation = designation;
	}
	
	Employee(String name,int ID,String designation,double salary){
		this.name = name;
		this.ID = ID;
		this.designation = designation;
		this.salary = salary;
	}
	
	Employee(String name,int ID,String designation,double salary,String promotionstatus){
		this.name = name;
		this.ID = ID;
		this.designation = designation;
		this.salary = salary;
		this.promotionstatus = promotionstatus;
	}
	
	void display(){
		System.out.println("Employee name: " + name);
		System.out.println("Employee ID: " + ID);
		System.out.println("Employee designation: " + designation);
		System.out.println("Employee salary: " + salary);
		System.out.println("Employee promotionstatus: " + promotionstatus);
	}
}

public class Constructor_overload{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Employee e = null;
		int choice;
		do{
			System.out.println("1.NAME AND ID,2.NAME,ID AND DESIGNATION,3.NAME,ID,DESIGNATION AND SALARY,4.ALL DETAILS,5.DISPLAY,6.EXIT: ");
			choice = s.nextInt();
			s.nextLine();
			switch(choice){
				case 1:
					System.out.println("Enter employee name: ");
					String name1 = s.nextLine();
					System.out.println("Enter employee ID: ");
					int id1 = s.nextInt();
					s.nextLine();
					e = new Employee(name1,id1);
					break;
				case 2:
					System.out.println("Enter employee name: ");
					String name2 = s.nextLine();
					System.out.println("Enter employee ID: ");
					int id2 = s.nextInt();
					s.nextLine();
					System.out.println("Enter employee designation: ");
					String designation2 = s.nextLine();
					e = new Employee(name2,id2,designation2);
					break;
				case 3:
					System.out.println("Enter employee name: ");
					String name3 = s.nextLine();
					System.out.println("Enter employee ID: ");
					int id3 = s.nextInt();
					s.nextLine();
					System.out.println("Enter employee designation: ");
					String designation3 = s.nextLine();
					System.out.println("Enter employee salary: ");
					double salary3 = s.nextDouble();
					s.nextLine();
					e = new Employee(name3,id3,designation3,salary3);
					break;
				case 4:
					System.out.println("Enter employee name: ");
					String name4 = s.nextLine();
					System.out.println("Enter employee ID: ");
					int id4 = s.nextInt();
					s.nextLine();
					System.out.println("Enter employee designation: ");
					String designation4 = s.nextLine();
					System.out.println("Enter employee salary: ");
					double salary4 = s.nextDouble();
					s.nextLine();
					System.out.println("Enter promotion status: ");
					String promotionstatus4  = s.nextLine();
					e = new Employee(name4,id4,designation4,salary4,promotionstatus4);
					break;
				case 5:
					if(e!=null)
						e.display();
					else
						System.out.println("Employee data not entered");
					break;
				case 6:
					System.out.println("Thank you");
					break;
				default:
					System.out.println("Invalid");
			}
		}while(choice!=6);
		//s.close();
	}
}