package Assignment;

import java.util.*;
public class GreatestTwo{
  public static void main(String args[])
  {
     int num1,num2;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Two Numbers:");
     num1=sc.nextInt();
     num2=sc.nextInt();
        if(num1>num2)
           {
              System.out.println("The First Number Is Greater ");              
           }

        else if(num2>num1)
          {
             System.out.println("The Second Number Is Greater");
          }

        else
         {
            System.out.println("Both are Equal");
         }

 }

}