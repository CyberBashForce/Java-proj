package teach1;

public class StringFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		
		String str = "Hello    World!  ";
		
		StringBuffer s = new StringBuffer(str);
		
		int length = str.length();
		
		System.out.println("Lenght of a current string  : "+ length);
		
		System.out.println("Character at index 6 is "+str.charAt(6));
		
		System.out.println("Substring from index 7 to 10 : "+str.substring(7, 10));
		
		System.out.println("Concatenation : "+str.concat(" This msg is from Jupiter!"));
		
		sb.append(str);
		System.out.println("Permanent Concatenation : "+sb.append(" This msg is from Jupiter!"));
		
		System.out.println(sb);
		
		System.out.println("Last index : " + str.lastIndexOf("o"));
		
		System.out.println(str.trim());
		
		String[] sarr = str.split(" ");
		
		for(int i=0;i<sarr.length;i++) {
			if(sarr[i].isEmpty()) {
				continue;
			}
			System.out.println(sarr[i].trim());
		}
		
		System.out.println(s.insert(0,"Surprise "));
		
		System.out.println(s.replace(0, 8, "1234"));
		
		System.out.println(str.intern());
		
		System.out.println(sb.insert(6, "Getit"));
		
		System.out.println(sb.reverse());
	}

}
