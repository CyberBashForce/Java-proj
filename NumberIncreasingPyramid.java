package Patterns;

public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for (int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}

	}

}