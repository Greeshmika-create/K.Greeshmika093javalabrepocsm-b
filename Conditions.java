import java.util.Scanner;
public class Conditions
{
	public static void main(String[] args)
	{
		System.out.println("Enter i:");
		Scanner sc = new Scanner (System.in);
		int i= sc .nextInt();
		if(i==0)
			System.out.println("i=0");
		else if(i>0)
			System.out.println("i is positive");
		else
			System.out.println("i is negative");
	}
}