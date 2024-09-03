import java.util.*;
public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int n = scan.nextInt();
		
		int t = n;int i =0;int s = 0;
		
		while(t>0) {
			
			int r = t%10;
			s = s*10+r;
			
			t -= r;
			t/=10;
			i++;
			
		}
		
		if(s == n) {
			System.out.println(n+ " is a Palindrome Number.");
		}else {
			System.out.println(n+" is not a Palindrome Number.");
		}
		
	}

}
