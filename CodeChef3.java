/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t != 0){
		    int n = sc.nextInt();
		    int a = 0, b = 0, c = 0;
		    a = n / 2;
		    n = n - a;
		    b = n / 2;
		    n = n - b;
		    c = n;
		    t--;
            System.out.println(a + " " + b + " " + c);
		}
	}
}
