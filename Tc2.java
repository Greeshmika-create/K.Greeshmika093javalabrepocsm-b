import java.util.Scanner;
public class Tc2
{
	public static void main(String[] args)
	{
		char ch;
		System.out.println("Enter a character:");
		Scanner s2 = new Scanner(System.in);
		ch = s2 .next().charAt(0);
		int i=ch;
		System.out.println(ch+" "+i);
	}
}