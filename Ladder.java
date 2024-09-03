package Practice;

import java.util.*;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number of steps : ");
		int step = s.nextInt();
		System.out.print("Enter Breadth of Ladder : ");
		int b = s.nextInt();
		
		for(int i=0;i<step*b+b;i++) {
			for(int j=0;j<b;j++) {
				if(i%b == 0 && i!=0) {
					System.out.print("* ");
				}else if(j==0 || j==b-1){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
