package Practice;

import java.util.*;

public class Leader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of integers : ");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter the " + (i+1) +  " element : ");
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		int max_index = 0;
		
		for(int i =0 ;i<n;i++) {
			if(arr[i] > max ) {
				max = arr[i];
				max_index = i;
			}
		}
		while(max_index <= n-1) {
			System.out.print(max + " ");
			max_index++;
			if(max_index == n-1) {
				max= arr[max_index];
				System.out.print(max);
				break;
			}
			max = arr[max_index];
			for(int j=max_index+1;j<n;j++) {
				if(arr[j] > max) {
					max = arr[j];
					max_index = j;
				}
			}
			if(max_index == n-1) {
				max= arr[max_index];
				System.out.print(max);
				break;
			}
			
		}
		
	}

}
