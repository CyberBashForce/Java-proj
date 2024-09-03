package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = scan.next();
		
		char arr[] = s.toCharArray();
		Arrays.sort(arr);
		String st = String.valueOf(arr);
		System.out.println(st);
		
	}

}
