package Practice;

import java.util.*;

public class No_Of_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = scan.next();
		
		char vowel[] = {'a','e','i','o','u'};
		
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<5;j++) {
				if(vowel[j] == s.charAt(i) || vowel[j]-32 == s.charAt(i)) {
					count++;
					break;
				}
			}
		}
		System.out.print(count);

	}

}
