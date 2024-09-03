package Practice;

import java.util.*;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan  = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = scan.nextInt();
		
		int s = n-1;int ch = 1;
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<=s-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<(2+(2*i));j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<((2*i)-2);j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
