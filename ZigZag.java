package Practice;

import java.util.*;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of line : ");
		int line = scan.nextInt();
		System.out.print("Enter the number of stars : ");
		int star = scan.nextInt();
		System.out.println("*");
		int t = line;
		while(line>0) {
			int s = 1;
			while(s<star-1) {
				for(int i=0;i<s;i++) {
					System.out.print("  ");
				}
				System.out.println("*");
				s++;
			}
			if(line == 1) {
				for(int i=0;i<s;i++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
			line--;
			if(line <=0) {
				break;
			}
			
			while(s>=0) {
				for(int i=0;i<s;i++) {
					System.out.print("  ");
				}
				System.out.println("*");
				s--;
			}
			line--;
		}
		
	}

}
