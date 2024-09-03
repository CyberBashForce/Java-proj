package Practice;

import java.util.Scanner;

public class Remove_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = scan.next();
		
		char arr[] = s.toCharArray();
		char vowels[] = {'a','e','i','o','u'};
		String temp = "";
		boolean ch = true;
		for(char c:arr) {
			for(char v:vowels) {
				if(c == v || c== v-32) {
					ch = false;
					continue;
					
				}
			}
			if(ch) {
				temp+=c;
				
			}
			ch = true;
		}
		System.out.println(temp);
	}

}
