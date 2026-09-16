class A{
	int a;
	int b;
	A(int c,int d){
		a=c;
		b=d;
	}
	int m1(){
		return a;
	}
	int m2(){
		return b;
	}
}
class Tc11{
	public static void main(String[] args){
		A r = new A(120,240);
		System.out.println(r.m1());
		System.out.println(r.m2());
	}
}