package Patterns;

public class RightPascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for (int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				
				if((i+1)%2 == 1) {
					if((j+1)%2 == 1) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}else {
					if((j+1)%2 == 0) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				
			}
			System.out.println();
		}
		for (int i=n-2;i>=0;i--) {
			for(int j=0;j<i+1;j++) {
				
				if((i+1)%2 == 1) {
					if((j+1)%2 == 1) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}else {
					if((j+1)%2 == 0) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				
			}
			System.out.println();
		}

	}

}
