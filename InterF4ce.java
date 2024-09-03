package Practice;

interface one{
	void onefunc();
}

interface two{
	void twofunc();
}

class Check implements one,two{
	
	public void onefunc() {
		System.out.println("Exec from onefunc!");
	}
	
	public void twofunc() {
		System.out.println("Exec from twofunc");
	}
	
}

class Stack extends Check{
	Stack(int x){
		System.out.println("You should not tell what i should do!"+x);
	}
	
	void method() {
		System.out.println("Do you called me!");
	}
	
}

public class InterF4ce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check obj = new Stack(2);
		obj.onefunc();
		obj.twofunc();

	}

}
