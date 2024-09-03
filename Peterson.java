package Practice;

import java.util.Scanner;

public class Peterson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int n = scan.nextInt();
		int t = n;
		int s = 0;
		
		while(t>0) {
			int r = t%10;
			t =t /10;
			int st =1;
			for(int i=1;i<=r;i++) {
				st = st*i;
			}
			s = s+st;
		}
		
		if(n == s) {
			System.out.println(n + " is a Peterson Number!");
		}
		else {
			System.out.println(n + " is not a Peterson Number!");
		}

	}

}
