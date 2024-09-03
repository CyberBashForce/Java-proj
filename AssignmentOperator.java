package teach1;

import java.util.*;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t = 7;
		
		System.out.println("t&=0b1010 "+(t &= 0b1010));
		System.out.println("t|=0b1010 "+(t |= 0b1010));
		System.out.println("t^=0b1010 "+(t ^= 0b0001));
		System.out.println("t>>1 "+(t>>=1));
		
		//Ternary Operator
		System.out.println((t<10)?("Allowable"):("Not Allowable"));

	}

}
