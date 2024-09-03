package Patterns;

public class ButterflyStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			int t = 0;
			for(int j=1;j<=i;j++) {
				if((j+i)%2 == 1) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
				t++;
			}
			for(int j=n-i;j>0;j--) {
				System.out.print("  ");
				t++;
			}
			for(int j=n-i-1;j>0;j--) {
				System.out.print("  ");
				t++;
			}
			for(int j=1;j<=i;j++) {
				if(i == n && j==n) {
					break;
				}
				if((t+i)%2 == 0) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
				t++;
			}
			System.out.println();
		}
		
		for(int i=n-1;i>0;i--) {
			int t = 0;
			for(int j=1;j<=i;j++) {
				if((j+i)%2 == 1) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
				t++;
			}
			for(int j=n-i;j>0;j--) {
				System.out.print("  ");
				t++;
			}
			for(int j=n-i-1;j>0;j--) {
				System.out.print("  ");
				t++;
			}
			for(int j=1;j<=i;j++) {
				if(i == n && j==n) {
					break;
				}
				if((t+i)%2 == 0) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
				t++;
			}
			System.out.println();
		}

	}

}
