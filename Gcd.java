package Basic1;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {13,26,39};
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if (a[i]<min) {min = a[i];}
		}
		
		int s = 1;
		boolean prime = true;
		boolean check = true;
		//Lets get the prime numbers
		for(int i=2;i<min+1;i++) {
			prime = true;
			for(int j = 2;j<i+1;j++) {
				if(i%j == 0 && j!=i) {
					prime = false;
					break;
				}
			}
			if(prime) {
				//System.out.println("Value : "+i);
				check =true;
				for(int k=0;k<a.length;k++) {
					if(a[k]%i != 0) {
						check = false;
						break;
					}
				}
				//s *=i;
			}
		}
		
		System.out.println("The GCD of the given array : "+s);

	}

}
