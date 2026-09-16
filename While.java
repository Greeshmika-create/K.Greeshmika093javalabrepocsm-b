import java.util.Scanner;
public class While
{
	public static void main(String[] args)
	{
		int i;
		System.out.println("Enter i:");
		Scanner s = new Scanner(System.in);
		i = s .nextInt();
		while(i<=0)
		{
			System.out.println(i);
			i++;
		}
	}
}