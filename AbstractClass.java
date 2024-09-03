package Practice;

//Let's Create an abstract class

abstract class Greetings{
	
	Greetings(){
		System.out.println("Allow me to Welcome You");
	}
	
	void exec() {
		System.out.println("Here i am, being executed from Abstract class.But i am not an abstract function");
	}
	
	abstract void test();
	
}

class Welcome extends Greetings{
	
	void test() {
		System.out.println("You know i am being executed from Welcome class!");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greetings obj = new Welcome();
		obj.exec();
		obj.test();
		
	}

}
