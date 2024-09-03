package Patterns;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<n;i++) {
			for(int j=n-i-1;j>0;j--) {
				System.out.print(" ");
			}
			int t =1;
			for(int j=1;j<=i+1;j++) {
				System.out.print(t+" ");
				t = t*(i+1-j)/j;
			}
			System.out.println();
		}

	}

}
