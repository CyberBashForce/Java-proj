package teach1;

import java.util.*;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the String to check : ");
		
		String st = s.nextLine();
		
		st = st.toUpperCase();
		
		String vowel = "AEIOU";
		
		int count =0;
		
		for(int i=0;i<st.length();i++) {
			for(int j =0 ;j<vowel.length();j++) {
				
				if(st.charAt(i)== vowel.charAt(j)) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);

	}

}
