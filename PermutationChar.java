package Practice;

import java.util.*;

public class PermutationChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s = scan.next();
		permutations(s);
		
	}	
	public static void permutations(String s) {
		List<String> ans = new ArrayList<>();
		ans.add(String.valueOf(s.charAt(0)));
		for(int i=1;i<s.length();i++) {
			for(int j=ans.size()-1;j>=0;j--) {
				String temp = ans.remove(j);
				for(int k=0;k<=temp.length();k++) {
					ans.add(temp.substring(0,k)+s.charAt(i)+temp.substring(k));
				}
			}
		}
		Collections.sort(ans);
		System.out.println(ans);
	}
}
