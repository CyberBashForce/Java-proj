package Practice;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the Number : ");
		
		int n = scan.nextInt();
		int t= 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(t+" ");
				t++;
			}
			System.out.println();
		}

	}

}
