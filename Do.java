import java.util.Scanner;
public class Do
{
	public static void main(String[] args)
	{
		int i;
		System.out.println("Enter i:");
		Scanner s = new Scanner(System.in);
		i = s .nextInt();
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=100);
	}
}