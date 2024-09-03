package Basic1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the value of N : ");
		
		int n = s.nextInt();
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact *=i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}

}
