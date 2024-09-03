package Practice;

import java.util.*;

public class Island {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number of islands : ");
		int N = scan.nextInt();
		System.out.print("Enter the Number of bridges : ");
		int M = scan.nextInt();
		System.out.print("Enter the Cost Of a Check Center  : ");
		int k = scan.nextInt();
		
		int arr[][] = new int[M][2];
		for(int i =0;i<M;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("Enter the Number : ");
				arr[i][j] = scan.nextInt();
			}
		}
		int tot = 0;
		for(int i =0;i<M;i++) {
			int doc = 0;
			for(int j=0;j<M;j++) {
				for(int p=0;p<2;p++) {
					if(arr[j][p] == i) {
						doc++;
					}
					if(doc>=2) {
						break;
					}
				}
			}
			if(doc >1) {
				tot++;
			}
		}
		System.out.println("Cost of Check Points : "+tot*k);
		
	}

}
