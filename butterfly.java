package Practice;

import java.util.*;

public class butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		int s = (n-1)*2-1;
		int c = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("* ");
			}
			for(int j=0;j<s;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<c;j++) {
				if(i == n-1 && j==c-1) {
					break;
				}
				System.out.print("* ");
			}
			System.out.println();
			c++;
			s-=2;
		}
		c = n-1;
		s = 1;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("* ");
			}
			for(int j=0;j<s;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<c;j++) {
				System.out.print("* ");
			}
			System.out.println();
			c--;
			s+=2;
		}
	}

}
