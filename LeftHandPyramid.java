package Patterns;

public class LeftHandPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=n-i-1;j>0;j--) {
				System.out.print("  ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
