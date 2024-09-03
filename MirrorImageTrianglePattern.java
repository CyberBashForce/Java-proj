package Patterns;

public class MirrorImageTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print(j+i+" ");
			}
			System.out.println();
		}
		for(int i=n-2;i>=0;i--) {
			for(int j=1;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print(j+i+" ");
			}
			System.out.println();
		}

	}

}
