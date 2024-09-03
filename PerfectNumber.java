package Practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=scan.nextInt();
		
		int s =0;
		for(int i=1;i<=(n/2);i++) {
			if(n%i == 0) {
				s =s+i;
			}
		}
		
		if(s == n) {
			System.out.println(n + " is a Perfect Number!");
		}else {
			System.out.println(n + " is not a Perfect Number");
		}
	
	}

}
