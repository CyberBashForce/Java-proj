package teach1;

import java.util.*;

public class TelephoneMapper {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Dictionary<Character, String> dict = new Hashtable<Character, String>();
		List<String> str = new ArrayList<>();
		dict.put('2', "ABC");
		dict.put('3', "DEF");
		dict.put('4', "GHI");
		dict.put('5', "JKL");
		dict.put('6', "MNO");
		dict.put('7', "PQRS");
		dict.put('8', "TUV");
		dict.put('9', "WXYZ");
		
		System.out.print("Enter the code : ");
		
		String pin = scan.next();
		String arr[] = new String[pin.length()];
		if(pin.length()==0) {
			System.out.println("Invalid Value!");
			return;
		}
		else {
			
			//Initial Setup!
			for(int i=0;i<pin.length();i++) {
				arr[i] = dict.get(pin.charAt(i));
			}
			String temp = arr[0];
			for(int j=0;j<temp.length();j++) {
				str.add(String.valueOf(temp.charAt(j)));
			}
			if(pin.length() == 1) {
				System.out.print(str);
				return;
			}
			
			//Permutation Logic!
			for(int i=1;i<arr.length;i++) {
				for(int j=str.size()-1;j>=0;j--) {
					String middleware = str.remove(j); //C
					String sample = arr[i];			   //DEF
					for(int k=0;k<sample.length();k++) {
						str.add(middleware+String.valueOf(sample.charAt(k)));	//C+D
					}
				}
			}
			
			Collections.sort(str);
		}
		System.out.print(str);
	}

}
