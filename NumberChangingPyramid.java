package Patterns;

public class NumberChangingPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int t=1;
		for (int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(t+" ");
				t++;
			}
			System.out.println();
		}

	}

}
