package Practice;

import java.util.*;

public class Gift_It {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the No of People : ");
		int N = scan.nextInt();
		System.out.print("Enter the No of Relations : ");
		int R = scan.nextInt();
		int arr[][]= new int[R][2];
		for(int i=0;i<R;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("Enter the Relation : ");
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.print("Enter John Position : ");
		int J = scan.nextInt();
		System.out.print("Enter Dave Position : ");
		int D = scan.nextInt();	
		int min_rel = -1,current_element = J, nearby_element = 0, prev_element = 0;
		while(current_element != D) {
			boolean ch = false;
			for(int i =0;i<R;i++) {
				for(int j=0;j<2;j++) {
					if(arr[i][j] == current_element) {
						if(j==0 && prev_element!= arr[i][1]) {
							ch = true;
							nearby_element = arr[i][1];
							break;
						}
						if(j==1&&prev_element!= arr[i][0]){
							ch = true;
							nearby_element = arr[i][0];
							break;
						}
						
					}
				}
			}
			if(ch==false) {
				min_rel = -1;
				break;
			}
			min_rel+=1;
			prev_element = current_element;
			current_element = nearby_element;
		}
		System.out.println(min_rel);
	}

}
