package teach1;

import java.util.*;

public class MatrixSwap {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		int a[][]= new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
				System.out.print("Enter the "+(j+1)+" th number : ");
				a[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Before swap : ");
		
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("After swap : ");
		
		for(int i=2;i>=0;i--) {
			for(int j =0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
