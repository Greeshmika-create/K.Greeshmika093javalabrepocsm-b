import java.util.Scanner;
public class For
{
	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in);
		num = s .nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
	}
}