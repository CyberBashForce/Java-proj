package teach1;

public class wrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//let's Create a wrapper object of int and double datatype
		
		int a = 1;
		double d  = 2.02;
		
		Integer iobj = Integer.valueOf(a);
		Double dobj = Double.valueOf(d);
		
		if(iobj instanceof Integer) {
			System.out.println("iobj is an instance of Integer");
		}
		if(dobj instanceof Double) {
			System.out.println("dobj is an instance of Double!");
		}
		
		System.out.println(iobj);
		System.out.println(dobj);

	}

}
