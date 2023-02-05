package Assignment;
import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner h=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=h.nextInt();
		
		int i,count=0;
		
		for(i=1;i<=n;i++){
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) 
			System.out.println("Prime number");
		
		else {
			System.out.println("Not a Prime Number");
		}
		
		

	}

}
