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
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++){
		    int W = sc.nextInt();
		    int XY = sc.nextInt()-sc.nextInt();
		    int Z = sc.nextInt();
		    
		    System.out.println(W + (XY*Z));
		}
		sc.close();
	}
}
