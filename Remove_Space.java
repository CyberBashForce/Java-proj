package Practice;

import java.util.Scanner;

public class Remove_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = scan.nextLine();
		
		char arr[] = s.toCharArray();
		String temp = "";
		for(char c:arr) {
			if(c != ' ') {
				temp+=c;	
			}
		}
		System.out.println(temp);
	}

}
