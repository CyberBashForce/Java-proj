package teach1;
import java.util.*;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.print("Enter the number of elements : ");
		
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		//Get array Elements
		
		int t = 0;
		
		for(int i=0;i<n;i++) {
			System.out.print((i+1)+" element : ");
			t = s.nextInt();
			arr[i] = t;
		}
		
		//Let's sort an array
		
		boolean c = true;
		int t1,t2;
		while(c) {
			c = false;
			for(int i=0;i<n-1;i++) {
				t1 = arr[i];
				t2 = arr[i+1];
				if(arr[i+1]<arr[i]) {
					t = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = t;
					c = true;
				}
			}
		}
		
		//Let's Get an element to be searched!
		
		System.out.print("Enter the element to be searched : ");
		
		int search = s.nextInt();
			
		//Let's Find whether it is in here!
		boolean check = false;
		int first = arr[0];
		int last = arr[n-1];
		while(first<=last) {
			int mid = first+(last-first)/2;
			if(mid == search) {
				System.out.println("Element "+search+" is found!");
				check = true;
				break;
			}
			else if(search < mid) {
				last = mid-1;
			}else {
				first = mid+1;
			}
		}
		if(!check) {
			System.out.println("No elements were found!");
		}
	}

}
