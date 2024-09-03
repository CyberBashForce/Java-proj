package Basic1;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Let's define two arrays for testing
		int ar1[][]= {{2,3},{1,4},{6,2}};
		
		int ar2[][]= {{1,2,5},{3,4,6}};
		int ar1_r = 3,ar1_c=2;
		int ar2_r=2,ar2_c=3;
		
		int arr[][]= new int[ar1_r][ar2_c];
		int x;
		for(int i=0;i<ar1_r;i++) {
			for(int j=0;j<ar1_c;j++) {
				x = ar1[i][j];
				for(int k=0;k<ar2_c;k++) {
					arr[i][k] += x*ar2[j][k];
				}
			}
			
			
		}
		
		for(int i=0;i<ar1_r;i++) {
			for(int j=0;j<ar2_c ;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}

	}

}
