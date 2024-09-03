package teach1;
import java.util.*;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scan.nextInt();
		System.out.print("Enter the Number 2 : ");
		int n2 = scan.nextInt();
		String s = Integer.toBinaryString(n);
		String s2 = Integer.toBinaryString(n2);
		String zero = "0";
		if(s.length()!=s2.length()) {
			int t = s.length();
			if(s2.length()>t) {
				t = s2.length();
				int dif = t-s.length();
				for(int i=0;i<dif;i++) {
					s = zero+s;
				}
			}else {
				t = s.length();
				int dif = t-s2.length();
				for(int i=0;i<dif;i++) {
					s2 = zero+s2;
				}
			}
		}
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != s2.charAt(i)) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
