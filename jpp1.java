import java.util.scanner;
class jpp1{
	public static void main (string[] args){
		Scanner sc = new Scanner(system.in);
		int n = sc.newInt();
		
		int og=n;
		int rev=0;
		while(n>0){
			rev = rev*10 + n%10;
			n=n/10;
		}
		boolean palin;
		if(og==rev){
			palin = true;
		}
		else{
			palin = false;
		}
		
		//prime.check
		
		boolean prime=true;
		if(og<=1){
			prime = false;
		}
		else{
			for(int i=1;i<=original;i++){
				if(n%i==0){
					count++;
				}
				else{
					prime=true;
				}
			}
		if(count==2){
			prime=true;
		}
		else{
			prime=false;
		}
		}
		if(prime&palin){
			System.out.println(n + "is a prime palindrome");
		}
		else{
			System.out.printn(n + "is not a prime palindrome");
		}
	}
}