import java.util.*;
public class StrongNumber {
	static int f =1;
	static int fact(int k) {
		f = f*k;
		k-=1;
		if(k != 1) {
			fact(k);
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int n = scan.nextInt();
		
		int t = n;
		int sum = 0;
		
		while(t>0) {
			int r = t%10;
			sum+=fact(r);
			
			t-=r;
			t/=10;
		}
		System.out.print(fact(3));
	}

}
