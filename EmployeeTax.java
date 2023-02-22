package Assignment;
import java.util.*;

class TaxCalculator{
	
	static float basicSalary;
	static boolean citizenship;
	static int netSalary;
	static float tax;
	

//method 1

	static void calculateTax() {
	
	tax=30*basicSalary/100;
	System.out.println("The tax of  the employee for the"+basicSalary+" is "+tax);
                  }
//method 2
	static void deductTax() {
		
		netSalary=(int)(basicSalary-tax);
		System.out.println("The net salary of the employee :"+netSalary);
	}
	
//method 3
	static void validateSalary() {
		
		boolean response=(basicSalary>10000 && citizenship==true);
		if(response) {
			System.out.println("The salary and the Citizenship eligibility : "+response);
			
		}
		else {System.out.println("The salary and the Citizenship eligibility : "+response);
                      }
		
	}
	

}
//main class
public class EmployeeTax {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Salary");
		TaxCalculator.basicSalary=sc.nextFloat();
		System.out.println("Enter the citizenship(true if in india otherwise false)");
		TaxCalculator.citizenship=sc.nextBoolean();
		
		TaxCalculator.calculateTax();
		TaxCalculator.deductTax();
		TaxCalculator.validateSalary();
		

	}

}
