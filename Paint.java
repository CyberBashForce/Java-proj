package Practice;

import java.util.*;

public class Paint {
	
	static int fact(int n)
	{
		int k =1;
		while(n>0) {
			k*=n;
			n--;
		}
		return k;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int X = scan.nextInt();
		System.out.print("Enter the Number : ");
		int Y = scan.nextInt();
		int tot = 0;
		int temp = fact(X);
		for(int i=1;i<=Y;i++) {
			
			int ls = fact(i)*(fact(X-i));
			tot+=temp/ls;
		}
		
		System.out.println(tot);
		
	}

}
