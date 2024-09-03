package Practice;

import java.util.Scanner;

public class Leader2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of integers : ");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}

		for(int i = 0; i<n; i++) {
			int max = arr[i];
			for(int j = i+1;j<n; j++) {
				if(max>=arr[j]) {
					if(j == arr.length-1) {
						System.out.println(max);
					}
			    }
				else {
					break;
				}
	         }	
	    }
		
	}

}
