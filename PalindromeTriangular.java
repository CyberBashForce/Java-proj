package Patterns;

public class PalindromeTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=n-i-1;j>0;j--) {
				System.out.print("  ");
			}
			for(int j=i;j>=0;j--) {
				System.out.print(j+1+" ");
			}
			for(int j=1;j<i+1;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}

	}

}
