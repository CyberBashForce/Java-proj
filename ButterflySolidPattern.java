package Patterns;

public class ButterflySolidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print("* ");
			}
			for(int j=n-i;j>0;j--) {
				System.out.print("  ");
			}
			for(int j=n-i-1;j>0;j--) {
				System.out.print("  ");
			}
			for(int j=0;j<i;j++) {
				if(i == n && j==i-1) {
					break;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>0;i--) {
			for(int j=1;j<i+1;j++) {
				System.out.print("* ");
			}
			for(int j=n-i;j>0;j--) {
				System.out.print("  ");
			}
			for(int j=n-i-1;j>0;j--) {
				System.out.print("  ");
			}
			for(int j=0;j<i;j++) {
				if(i == n && j==i-1) {
					break;
				}
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
