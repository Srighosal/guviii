/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		if(d>0){
		System.out.println("Positive");
	}
	else if(d<0){
		System.out.println("Negative");
	}
	else if(d==0){
		System.out.println("Zero");
	}
}
catch(Exception e){
	System.out.println(e+" "+"invalid");
}
}
}
