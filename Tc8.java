import java.util.Scanner;
public class Tc8
{
	public static void main(String[] args)
	{
		long a;
		char b;
		System.out.println("Enter a value:");
		Scanner s1 = new Scanner(System.in);
		a = s1 .nextLong();
		System.out.println("Enter a character:");
		Scanner s2 = new Scanner(System.in);
		b = s2 .next().charAt(0);
		long c = a+b;
		System.out.println(a+"+"+b+"="+c);
	}
}