package Practice;

import java.util.*;

public class Floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scan.nextInt();
		int c = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(c+" ");c++;
			}
			System.out.println();
		}
		
	}

}
