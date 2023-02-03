package Assignment;
import java.util.*;

public class SeprateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value");
		int num=sc.nextInt();
		//convert interger to string
		String b=Integer.toString(num);
		
		//conver string to char
		char s[]=b.toCharArray();
		for(int i=0;i<=s.length;i++) {
			System.out.print(i+" ");
		}
		
	}

}
