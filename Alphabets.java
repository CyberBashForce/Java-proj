package Patterns;

import java.util.*;

class Draw{
	public static void d(char c) {
		switch(c) {
		case 'A':
			int s = 3;
			int ch = 2;
			int mid =1;
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=s;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=ch;j++) {
					System.out.print("*");
				}
				for(int j=1;j<mid;j++) {
					System.out.print(" ");
				}
				if(i ==1) {
					s-=1;
					System.out.println();
					continue;
				}
				for(int j=1;j<=ch;j++) {
					System.out.print("*");
				}
				System.out.println();
				s-=1;
				mid+=2;
				/*for(int j=1;j<=8;j++) {
					System.out.print("*");
				}
				System.out.println();*/
			}
			for(int i=1;i<=2;i++) {
				for(int j=1;j<=8;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=1;i<=2;i++) {
				for(int j=1;j<=2;j++) {
					System.out.print("*");
				}
				for(int j=1;j<=4;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=2;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		case 'B':
			System.out.print("Can it be executed!");
			/*for(int i=1;i<=7;i++) {
				for(int j=1;j<=8;j++) {
					System.out.print("*");
				}
				System.out.println();
			}*/
		}
		
	}
}

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw obj = new Draw();
		obj.d('A');
		
		//obj.draw('B');

	}

}
