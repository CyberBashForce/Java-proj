package teach1;
import java.util.Scanner;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		float f = 2.0f;
		byte b = 2;
		short s = 3;
		long l = 2000L;
		String str = "Makeit";
		char c = '5';
		
		//Let's Print out
		
		System.out.println("Integer type : "+i);
		
		//Let's get some integer 
		
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter an integer value : ");
		
		int g = obj.nextInt();
		
		//Let's print it back
		
		System.out.println("The integer you entered  : "+g);
		
		//Let's get some more string
		System.out.print("Enter your name : ");
		String str1 = obj.nextLine();
		
		System.out.println("Hello "+str1+'!');
		
	}

}
