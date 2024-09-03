import java.util.*;
public class RudolfAndTheUglyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		int arr[] = new int[t];
		
		for(int p = 0;p<t;p++) {
			int n = scan.nextInt();
			
			String s = scan.next();
			int count = 0;
			int temp = 0;
			while(temp < n-2) {
				if(s.charAt(temp) == 'm' && s.charAt(temp+1) == 'a' && s.charAt(temp+2) == 'p') {
					count++;
					temp = temp+3;
				}else if(s.charAt(temp) == 'p' && s.charAt(temp+1) == 'i' && s.charAt(temp+2) == 'e') {
					count++;
					temp = temp+3;
				}
				else {
					temp++;
				}
				if(temp >n-1) {
					break;
				}
				
			}
			arr[p] = count;
		}
		
		for(int i=0;i<t;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
