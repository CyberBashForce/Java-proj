package Practice;

import java.util.Scanner;

public class kthelement{

	public static void main(String[] args){

		System.out.print("Enter the Number : ");

		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt();

		int arr[] = {1,2,3,4,5,6,7,8,9,0};

		System.out.println(k +"th element in an array is "+arr[k-1]);

	}
	//scan.close();
}
