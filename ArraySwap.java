package Practice;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[] = {5,6,9};
		int a2[] = {1,2,3};
		
		int l = a1.length;
		
		for(int i=0;i<l;i++) {
			a1[i] = a1[i]+a2[i];
			a2[i] = a1[i]-a2[i];
			a1[i] = a1[i]-a2[i];
		}
		
		//Print out
		
		
		for(int i =0;i<l;i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		for(int i =0;i<l;i++) {
			System.out.print(a2[i]+" ");
		}
		

	}

}
