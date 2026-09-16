public class ForEach
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30,40,50};
		int size =a.length;
		for(int x : a)
			System.out.println(x);
		for(int i=0;i<size;i++)
				System.out.println(a[i]);
			
	}
}