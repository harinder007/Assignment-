package Assignment;
import java.util.*;

class AdvancedAirthmetic{
    int divisorSum(){ // method with return type
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
	    int number=sc.nextInt();
	    int j = 0;
	    System.out.println("Total divisor are :");
	         for(int i = 1; i <= number; i++) {
	             if (number % i == 0) {
	            	 System.out.println(" "+i);
	                 j = j + i; 
	             }
	             
	         
	         }
	         System.out.println("The Sum Of The Divisors is: ");
	         System.out.println(j);
	    return  divisorSum();    
	}
	}

public class MyCalculator extends AdvancedAirthmetic {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvancedAirthmetic obj=new AdvancedAirthmetic();//boject of first class
		obj.divisorSum();                               // call the method of parent class
		

	}

}
