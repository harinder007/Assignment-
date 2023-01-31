package ControlStatement;

public class PatternNo {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) { // for first row
			System.out.print(i + " ");
		}
		 System.out.println(); // next line
		for (int j=2;j<=10;j++) { //for secod row print 2 multiple
			 if(j%2 ==0) {
			System.out.print(j + " ");
			 }
		}System.out.println();//next line
			 for (int k=3;k<=15;k++) {
				 if(k%3 ==0) {
				System.out.print(k + " "); }
			 }System.out.println();
			 for (int l=4;l<=20;l++) {
				 if(l%4 ==0) {
				System.out.print(l + " "); }
		}System.out.println();
		for (int m=5;m<=25;m++) {
			 if(m%5 ==0) {
			System.out.print(m +" ");}
	}

		
	}

}
