package teach1;
import java.util.*;
public class DivsorsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scan.nextInt();
		for(int i=1;i<n/2;i++) {
			if(n%i == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(n);
	}

}
