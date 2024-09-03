package Patterns;

public class HollowTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=n-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				if(i == n-1) {
					System.out.print("* ");
					continue;
				}
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
