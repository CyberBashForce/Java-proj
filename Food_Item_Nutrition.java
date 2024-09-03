package Practice;

import java.util.*;

public class Food_Item_Nutrition {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of food items : ");
		int N = scan.nextInt();
		System.out.print("Enter the max nutrition in a meal : ");
		int M = scan.nextInt();
		System.out.print("Enter min Number of food items in a meal : ");
		int k = scan.nextInt();
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			System.out.print("Enter the nutrition of a food : ");
			arr[i] = scan.nextInt();
		}
		
		//M <= max-min
		//k and greater than k groups of food items in a meal
		int min_meals = 0;
		int temp = 0;
		int min =arr[0],max= arr[1];
		for(int i=0;i<N;i++) {
			for(int j=i+(i*k);j<k;j++) {
				if(arr[j]<min) {
					min = arr[j];
				}else if(arr[j]>max) {
					max = arr[j];
				}
			}
			if(max-min<=M && max-min >=0) {
				
				if(max-min ==0) {
					min_meals = 1;
				}else {
					min_meals++;
				}
			}
		}
		if(min_meals == 0) {
			min_meals = -1;
		}
		System.out.print(min_meals);
	}
	
}
