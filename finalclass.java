package teach1;

class semifinale{
	void method() {
		System.out.println("Hello from Semifinale Class!");
	}
	
	String semi = "String from semi!";
}

final class Finale extends semifinale{
	void method() {
		System.out.println("Hello from Finale Class!");
	}
	
	String s = "I am a string!";
}

public class finalclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Finale f = new Finale();
		semifinale sf = new semifinale();
		
		f.method();
		sf.method();
		System.out.println(f.s);
		System.out.println(f.semi);
		
	}

}
