package ArrayAssignment;

public class ClonningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {2,4,6,7};
		System.out.println("Print th Actual Array");
		for(int i:arr)  // for each loop
			System.out.println(i);
		
		System.out.println("Print the clone array");
		
		int crr[]=arr.clone();  // creating the clone
		for(int i:crr)
			System.out.println(i);
		
		System.out.println("Both are Equal or not?");
		System.out.println(arr==crr);
// both are unequal because their refernce is not same they are store in differnce variable
	}

}
