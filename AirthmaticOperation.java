package Assignment;
import java.util.*;
public class AirthmaticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number 1 and number 2");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int sum=num1+2;
		int product=num1*num2;
		int sub=num1-num2;
		int average=(num1+num2)/2;
		float divide=num1/num2;
		 System.out.println(" sum of no. = "+sum+" difference is = "+sub+" Producct is = "+product+" average is = "+average+" division is = "+divide);
		
	}

}
