package Practice;
import java.util.*;
public class Suit_Up {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the Number : ");
			arr[i] = scan.nextInt();
		}
		int max_benefit = 0;
		int i = 0;
		int max,min;
		if(n == 1) {
			max_benefit = 0;
			System.out.println(max_benefit);
			return;
		}
		if(arr[i]<arr[i+1]) {
			min = arr[i];
			max = arr[i+1];
		}else {
			min = arr[i+1];
			max = arr[i];
		}
		int j = i+2;
		while(i<n) {
			
			for( j =i+2;j<n;j++) {
				if(arr[j] > max) {
					max = arr[j];
				}
				if(arr[j]<min) {
					min = arr[j];
				}
				if(arr[j]<max) {
					i = j;
					break;
				}
			}	
			max_benefit+=(max-min);
			min = arr[i];
			max = arr[i+1];
			if(j>=n) {
				break;
			}
		}
		System.out.println(max_benefit);
	}

}
