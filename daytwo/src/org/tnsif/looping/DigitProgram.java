package org.tnsif.looping;
import java.util.*;
public class DigitProgram {

	public static void main(String[] args) {
		
		int count = 0;
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter a number :");
	    int num = s.nextInt();
	   
	    while(num!=0)
	    {
	         num = num/10;
	         count++;
	    }
	      System.out.println("Number of digits are : " + count);

	}

}