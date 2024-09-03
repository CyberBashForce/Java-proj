import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i=0;i<t;i++){
		    int n = scan.nextInt();
		    String S = scan.next();
		    int count = 0;
		    int zeros = 0;
		    int j =0;
		    while(j<n){
		        if(S.charAt(j) == '1'){
		            count++;
		            j++;
		        }else{
		            int val = 0;
		            System.out.println(n+"#"+j);
		            char temp = S.charAt(j);
		            while(S.charAt(j) == temp){
		                j+=1;
		                val++;
		                if(j>=n){
		                    break;
		                }
		                System.out.print("*"+j);
		            }
		            if(val>zeros){
		                zeros = val;
		            }
		        }
		    }
		    count += zeros;
		    System.out.println(count);
		}

	}
}
