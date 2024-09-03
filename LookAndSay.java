package teach1;

import java.util.*;

public class LookAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of sequence required : ");
		int n = scan.nextInt();
		String val = "1";
		String st = "";
		if(n == 1) {
			System.out.print(val);
			return;
		}else {
			System.out.println(val);
		}
		for(int i =0;i<n-1;i++) {
			int count =0;
			char t = val.charAt(0);
			for(int j=0;j<val.length();j++) {
				if(val.charAt(j) == t) {
					count++;
				}else {
					st=st.concat(String.valueOf(count)+String.valueOf(t));
					count = 1;
					t = val.charAt(j);
				}
				if(j == val.length()-1) {
					st = st.concat(String.valueOf(count)+String.valueOf(t));
					val = st;
					break;
				}
			}
			System.out.println(st);
			st = "";		
		}
	}

}
