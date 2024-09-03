package teach1;

import java.util.*;

public class NearestRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the integer to check : ");
		
		int t = s.nextInt();
		
		if(t%10 < 5) {
			System.out.println(t-(t%10));
		}
		else {
			System.out.println(t+(10-(t%10)));
		}
		
	}

}
