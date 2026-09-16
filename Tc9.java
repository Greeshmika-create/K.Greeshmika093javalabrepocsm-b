import java.util.Scanner;
public class Tc9
{
	public static void main(String[] args)
	{
		double a;
		char b;
		System.out.println("Enter a value:");
		Scanner s1 = new Scanner(System.in);
		a = s1 .nextDouble();
		System.out.println("Enter a character:");
		Scanner s2 = new Scanner(System.in);
		b = s2 .next().charAt(0);
		double c = a+b;
		System.out.println(a+"+"+b+"="+c);
	}
}