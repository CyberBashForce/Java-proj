package Practice;
import java.util.*;

public class ZeroToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = scan.nextInt();
		
		int s = 0;
		int i = 0;
		while(n>0) {
			int r = n%10;
			if(n%10 == 0) {
				s = 1*(int)(Math.pow(10,i))+s;
			}else {
				s = (r*(int)(Math.pow(10, i))) + s;
			}
			n-=r;
			n/=10;
			i++;
			System.out.println(s);
		}
		System.out.println("Surprise : "+s);
	}

	
}
