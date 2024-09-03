package Practice;

import java.util.*;

public class Toggle_Each_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = scan.next();
		String temp = "";
		for(int i=0;i<s.length();i++) {
			char t = s.charAt(i);
			if(s.charAt(i)<97) {
				temp+=(char)(t+32);
			}else {
				temp+=(char)(t-32);
			}
		}
		
		System.out.println(temp);

	}

}
