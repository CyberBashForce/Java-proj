package Patterns;

public class ZeroOneTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for (int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				
				if((i+1)%2 == 1) {
					if((j+1)%2 == 1) {
						System.out.print(1+" ");
					}else {
						System.out.print(0+" ");
					}
				}else {
					if((j+1)%2 == 0) {
						System.out.print(1+" ");
					}else {
						System.out.print(0+" ");
					}
				}
				
			}
			System.out.println();
		}

	}

}
