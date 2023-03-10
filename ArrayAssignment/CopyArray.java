package ArrayAssignment;

public class CopyArray {

	public static void main(String[] args) {
		
		char[]copyFrom= {'a','b','c','d','e','f','d'};
		
		char[]copyTo=new char[6]; // pass the length of array
		
		
		System.arraycopy(copyFrom,2, copyTo,1, 3);
		
		System.out.println(String.valueOf(copyTo)); // print the copied value

	}

}
