import java.util.*;
public class armstrong {
    public static void main(String args[]){
        Scanner 
        sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int nn=n;
        String s= Integer.toString(n);
        int l=s.length();
        int total=0,sum,x=n%10;
        System.out.println("No. of Digit :"+x);
        for(int i=1;i<=l;i++){
            
            sum=x;
            for(int j=1;j<l;j++){
                sum=sum*x;
            }
            total+=sum;
            n=n/10;
            x=n%10;
        }
        if(total==nn){
            System.out.println("It is a armstrong no.");

        }
        else{
            System.out.println("not a armstrong number");
        }
    }


    
}                                                                                                     
