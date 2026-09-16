class A{
	int i;
	int j;
	int k;
	A(int i){
		this.i=i;
	}
	A(int i,int j){
		this.i=i;
		this.j=j;
	}
	A(int i,int j,int k){
		this.i=i;
		this.j=j;
		this.k=k;
	}
	void m(){
		System.out.println(i+j+k);
	}
}
class Tc10{
	public static void main(String[] args){
		A a = new A(10);
		//A a = new A(20,30);
		//A a = new A(40,50,60);
		a.m();
	}
}