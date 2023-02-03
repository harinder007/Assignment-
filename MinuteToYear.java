package Assignment;
import java.util.*;

public class MinuteToYear {

	
		 public static void main(String[] Strings) {


		        Scanner sc = new Scanner(System.in);

		        System.out.print("Input the number of minutes: ");
		        
		        int min = sc.nextInt();
		        // minutes to days 60*24=1440minute(i.e 1days)
		        int days=min/1440;
		        // days to year 1440*365=1year
		        int year=days/365;

		        System.out.println((int) min + " minutes is approximately " + year + " years and " + days + " days");

	}

}
