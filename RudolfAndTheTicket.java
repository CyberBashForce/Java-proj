import java.util.*;
public class RudolfAndTheTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		int arr[] = new int[t];
		
		for(int i=0;i<t;i++) {
			
			int m = scan.nextInt();
			int n = scan.nextInt();
			
			int k = scan.nextInt();
			
			int left[] = new int[m];
			int right[] = new int[n];
			
			for(int j=0;j<m;j++) {
				left[j] = scan.nextInt();
			}
			for(int j=0;j<n;j++) {
				right[j] = scan.nextInt();
			}
			
			int count = 0;
			
			if(m>n) {
				for(int j=0;j<n;j++) {
					int temp = right[j];
					if(temp<k) {
						for(int ld = 0;ld<m;ld++) {
							if(temp+left[ld]<= k) {
								count++;
							}
						}
					}
				}
			}else {
				for(int j=0;j<m;j++) {
					int temp = left[j];
					if(temp<k) {
						for(int ld = 0;ld<n;ld++) {
							if(temp+right[ld]<= k) {
								count++;
							}
						}
					}
				}
			}
			
			arr[i] = count;
			
		}
		
		for(int i =0;i<t;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
