/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=0;
		if(sc.hasNextInt()){
        n= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int len=sc.nextInt();
            int arr[]=new int[len];
            int eve=0;
            int odd=0;
            for(int j=0;j<len;j++)
            {
                if(j%2==0)
                eve+=sc.nextInt();
                else
                odd+=sc.nextInt();
                //arr[j]=sc.nextInt();
            }
            System.out.println(Math.max(eve,odd));
        }
	}
}
