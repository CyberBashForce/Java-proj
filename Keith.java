package teach1;

import java.util.*;

public class Keith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int n = scan.nextInt();
		
		int d = 0;
		
		int temp = n;
		
		while(n>0) {
			n /=10;
			d++;
		}
		n =temp;
		int arr[] = new int[d];
		
		int increment =d-1 ;
		while(n>0) {
			arr[increment] = n%10;
			n/=10;
			increment--;
		}
		
		for(int i=0;i<d;i++) {
			//System.out.println(arr[i]);
		}
		
		n = temp;
		//System.out.println(d);
		int sample = 0;
		while(sample<=temp) {
			for(int i=0;i< d;i++) {
				int t = arr[i];
				sample = sample + t;
				//System.out.println(arr[0]);
			}
			if(sample == temp) {
				break;
			}
			else {
				for(int i =0;i<d;i++) {
					if(i == d-1) {
						arr[i] = sample;
						break;
						//System.out.println(sample);
					}else {
						arr[i] = arr[i+1];
					}
				}
				if(sample>temp) {
					break;
				}
				sample = 0;
			}
			
		}
		
		if(sample == temp) {
			System.out.println(temp+ " is a Keith Number!");
		}else {
			System.out.println(temp+ " is not a Keith Number!");
		}

	}

}
