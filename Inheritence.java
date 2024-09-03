package Practice;

class SuperHeroQuotes{
	void tellMe() {
		System.out.println("Marvel Character Quotes");
	}
	
	void famous() {
		System.out.println("Famous man once said,We create our own demons");
	}
}

class IronMan extends SuperHeroQuotes{
	
	IronMan(){
		System.out.println("I can be executed!");
	}
	
	void tellMe()
	{
		System.out.println("I am Iron Man!");
	}
	
	void affirmation() {
		System.out.println("Contrary to Popular belief I know exactly what I am doing!");
	}
}

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Let's create an object
		IronMan i = new IronMan();
		
		i.tellMe();
		i.affirmation();
		i.famous();
		
		SuperHeroQuotes s = new SuperHeroQuotes();
		s.tellMe();

	}

}
