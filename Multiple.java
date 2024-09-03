package Practice;

class A{
	
	A(){
		System.out.println("HelloWorld!");						
	}
	
	void afunc() {
		System.out.println("Can you see my name : A");
	}
}

class B extends A{
	void bfunc() {
		System.out.println("Can you see my name : B");
	}
}

class C extends A{
	void cfunc() {
		System.out.println("Can you see my name : C");
	}
}

class D extends A{
	void dfunc() {
		System.out.println("Can you see my name : D");
	}
}

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a = new B();
		
		a.afunc();
		a.bfunc();
		

	}

}
