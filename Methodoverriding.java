import java.util.Scanner;
class RBI{
	void rateofinterest(){
		System.out.println("RBI Rate of interest : 4%");
	}
}
class SBI extends RBI{
	void rateofinterest(){
		System.out.println("SBI rate of interest : 7%");
	}
}
class HDFC extends RBI{
	double rate;
	HDFC(double rate){
		this.rate = rate;
	}
	void rateofinterest(){
		System.out.println("HDFC rate of interest : " + rate + "%");
	}
}
public class Methodoverriding{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter HDFC rate of interest: ");
		double rate = s.nextDouble();
		RBI r;
		r = new RBI();
		r.rateofinterest();
		r = new SBI();
		r.rateofinterest();
		r = new HDFC(rate);
		r.rateofinterest();
	}
}