package Patterns;

public class HollowDiamondPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=n-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				if(j ==1 || j==i+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=n-2;i>=0;i--) {
			for(int j=n-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				if(j ==1 || j==i+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
