package Practice;

import java.util.Scanner;

public class Trainee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1 = 0,s2 = 0,s3 = 0;
		Scanner obj = new Scanner(System.in);
		for (int i=0;i<3;i++) {
			System.out.println("Enter the Values : ");
			int a = obj.nextInt();
			int b = obj.nextInt();
			int c = obj.nextInt();
			s1 = s1+a;
			s2 = s2+b;
			s3 = s3+c;
		}
		
		s1 = s1/3;
		s2 = s2/3;
		s3 = s3/3;
		
		int max = s1;
		if(s2>max) {
			max = s2;
		}else if(s3>max) {
			max = s3;
		}
		
		if(s1 == max) {
			System.out.println("Trainee 1 ");
		}
		if(s2 == max) {
			System.out.println("Trainee 2 ");
		}
		if(s3 == max) {
			System.out.println("Trainee 3 ");
		}

	}

}
