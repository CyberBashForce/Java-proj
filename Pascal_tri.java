package Practice;

import java.util.*;

public class Pascal_tri {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the  number of lines  : ");
		
		int n = scan.nextInt();

		int arr[] = new int[n];
		int arr1[] = new int[n];
		
		arr[0] = 1;
		arr[1] = 1;
		for(int i=0;i<n;i++) {
			
			if(n == 1) {
				System.out.println(arr[0]);
				return;
			}else if(n == 2) {
				System.out.println(" "+arr[0]);
				System.out.println(arr[0]+" "+arr[1]);
				return;
			}else {
				//Space for loop
				for(int l=0;l<n-i-1;l++) {
					System.out.print(" ");
				}
				
				arr1[0] = 1;
				if(i == 0) {
					System.out.print(arr1[0]);
					System.out.println();
					continue;
				}else if(i == 1) {
					System.out.print(arr[0]+" "+arr[1]);
					arr1[1] = 1;
					arr = arr1.clone();
					System.out.println();
					continue;
				}else {
				for(int j=0;j<=i-2;j++) {
					arr1[j+1] = arr[j]+arr[j+1];
					arr1[j+2] = 1;
					
				}
				for(int k =0;k<arr1.length;k++) {
					if(arr1[k] == 0) {
						break;
					}
					System.out.print(arr1[k]+" ");
				}
				System.out.println();
				arr = arr1.clone();
				}
			}
			
		}
		
	}

}
