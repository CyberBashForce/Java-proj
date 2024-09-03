package Practice;

import java.util.*;

public class SumOfDigits {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int n = scan.nextInt();
		
		int s = 0;
		
		while(n>0) {
			int r = n%10;
			s+=r;
			n-=r;
			n/=10;
		}
		
		System.out.print("Sum of digits : "+s);
		
	}
	
}
