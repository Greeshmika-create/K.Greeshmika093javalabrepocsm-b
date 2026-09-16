class A{
	int i=10;
	int j=20;
	void m1(){
		System.out.println("S.C.M");
	}
}
class B extends A{
	int k = 3;
	void m2(){
		System.out.println("C.C.M");
	}
}
class Tc13{
	public static void main(String[] args){
		B b = new B();
		b.m1();
		b.m2();
		System.out.println(b.i);
		System.out.println(b.j);
		System.out.println(b.k);
		A a = new A();
		a.m1();   
		System.out.println(a.i);
		System.out.println(a.j);
	}
}