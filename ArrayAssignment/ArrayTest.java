package ArrayAssignment;

import java.util.Scanner;//for scanner

public class ArrayTest {//main class
public static void main(String[] args) {//main method
	int sum=0;//local variable
	Scanner sc= new Scanner(System.in);//taking input from user
	System.out.println("Enter the size of array:");
	int a=sc.nextInt();//size of array
	int arr[]= new int[a];
	System.out.println("Enter elements:");
	for(int i=0;i<a;i++) {//enter all the element of the array
		arr[i]=sc.nextInt();
		sum=sum+arr[i];
	}
	System.out.println("The sum of the array: "+sum);
}
}
