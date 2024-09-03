package Practice;

import java.util.Scanner;

public class Sunny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		
		int n = scan.nextInt();
		boolean flag = false;
		int t = 1,s = 1;
		while(s<n) {
			if(s-1 == n) {
				flag = true;
				break;
			}
			t++;
			s= t*t;
		}
		if(flag) {
			System.out.println(n + " is a Sunny Number!");
		}else {
			System.out.println(n + " is not a Sunny Number!");
		}
	}

}
