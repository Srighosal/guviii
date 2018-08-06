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
	Scanner sc=new Scanner(System.in);
			char d=sc.next().charAt(0);
			if(Character.isAlphabetic(d)) {
			if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u'){
			System.out.println("Vowel");
		}	else if(d!='a'||d!='e'||d!='i'||d!='o'||d!='u') {
			System.out.println("Consonants");
	}
			}
			else {
				System.out.println("invalid");
			}
}
}
