package Practice;

import java.util.Scanner;

class Helper{
	
	Scanner s = new Scanner(System.in);
	
	String j = "Value inside Helper";
	
	int x;
	
	void get() {
		System.out.print("Please give some integer value to process : ");
		x = s.nextInt();
	}
	
	int multiply(int a,int b) {
		return a*b;
	}
	
	double multiply(double a,double b) {
		return a*b;
	}
	
	Helper(){
		System.out.println("I got executed when you created an instance of me!");
		j = "Value inside the constructor";
		get();
	}
	
}

public class OverLoadingMethod {
	
	public static void main(String args[]) {
	
		Helper h = new Helper();
		
		//h.j = "Value from Main class!";
		
		System.out.println(h.multiply(4, 6));
		
		System.out.println(h.multiply(4.5, 2));
		
		System.out.println(h.j);
		
		System.out.println(h.x);
	}

}
