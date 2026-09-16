import java.util.Scanner;
class Prime_palindrome{
	public static void main(String[] args){
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = s.nextInt();
		boolean prime = true;
		if(n<2)
			prime = false;
		else{
			for(int i = 2;i<(n/2);i++){
				if(n % i == 0){
					prime = false;
					break;
				}
			}
		}
			
		int temp = n;
		int rev = 0;
	
		while(temp>0){
			int digit;
			digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;
		}
	
		if(prime && n == rev)
			System.out.println(n + " is a Prime palindrome");
		else
			System.out.println(n + " is not a Prime palindrome");
	}
}