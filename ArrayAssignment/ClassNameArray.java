package ArrayAssignment;

public class ClassNameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,5,5};
		// Class is class name of array class
		Class sc=a.getClass();
		String name=sc.getName();// getting the class name
		
		// it will print the classs which is integer type
		System.out.println(sc);

	}

}
