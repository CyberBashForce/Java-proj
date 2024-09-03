package Practice;

import java.util.*;

public class Candy {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int array[]= {2,3,5,1,3};
		System.out.print("Enter the extra Candies you have : ");
		
		int extraCandy = scan.nextInt();
		check(array,extraCandy);
	}
	
	public static void check(int arr[],int ec) {
		int max = 0;
		boolean tarr[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > arr[max]) {
				max = i;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i == max) {
				tarr[i] = true;
				continue;
			}
			if(arr[i]+ec >= arr[max]) {
				tarr[i] = true; 
			}
			else {
				tarr[i] = false;
			}
		}
		
		for(int i=0;i<tarr.length;i++) {
			System.out.print(tarr[i]+" ");
		}
	}
	
}
