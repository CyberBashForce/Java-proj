package Practice;

import  java.util.*;

public class Rectangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rscan = new Scanner(System.in);
		
		System.out.print("Enter the Length of a reactangle : ");
		int l = rscan.nextInt();
		System.out.print("Enter the Breadth of a rectangle : ");
		int b = rscan.nextInt();
		
		//Solid Pattern
		System.out.println("Solid Pattern!");
		
		for(int i =1;i<=b;i++) {
			for(int j=1;j<=l;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Hollow Pattern
		System.out.println("Hollow Pattern!");
		
		for(int i=1;i<=b;i++) {
			if(i == 1 || i == b) {
				for(int j =1;j<=l;j++) {
					System.out.print("* ");
				}
			}else {
				for(int j=1;j<=l;j++) {
					if( j == 1 || j==l) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}

}
