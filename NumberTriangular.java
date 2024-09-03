package Patterns;

public class NumberTriangular {

	public static void main(String args[]) {
		
		int n = 4;
		for(int i=0;i<n;i++) {
			for (int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
		
	}
	
}
