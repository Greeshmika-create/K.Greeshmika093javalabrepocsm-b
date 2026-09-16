import java.util.Scanner;
public class Tc4
{
	public static void main(String[] args)
	{
		byte a,b;
		System.out.println("Enter a value:");
		Scanner s1 = new Scanner(System.in);
		a = s1 .nextByte();
		System.out.println("Enter a value:");
		Scanner s2 = new Scanner(System.in);
		b = s2 .nextByte();
		int c = a+b;
		System.out.println(a+"+"+b+"="+c);
	}
}