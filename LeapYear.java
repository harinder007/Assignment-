package ControlStatement;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year name");
		int year=sc.nextInt();
		
	     if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
	       System.out.println (year + " is a Leap Year");

	     //not leap year
	     else
	         System.out.println (year + " is not a Leap Year");

	}

}
