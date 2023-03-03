package ArrayAssignment;
import java.util.Scanner;//user define
public class ArrayAverage {

	public static void main(String[] args) {//main method
		int average=0;//local variable
		System.out.println("Enter the number of element");
		Scanner sc= new Scanner(System.in);//taking input from user
		int n= sc.nextInt();//size of array
		System.out.println("Enter the Element");
		for(int i=0;i<n;i++) {
			int arr[]= new int[n];//declaration
			 arr[i]=sc.nextInt();// Store the value of element
			 average=average+arr[i];
			}
			
		 average=average/n;
		 System.out.println("Average of giving number: "+average);
	}
	}