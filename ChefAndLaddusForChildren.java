/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
       Scanner sc=new Scanner(System.in);
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        if(sc.hasNextInt()){
        n= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int l=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[l];
            for(int j=0;j<l;j++)
            {
                arr[j]=sc.nextInt();
            }
            System.out.println(res(arr,k));
        }
	}
	public static int res(int arr[],int k)
	{
	    int min=Integer.MAX_VALUE;
	    if(arr.length<k)
	    return 0;
	    Arrays.sort(arr);
	    for(int i=0;i<arr.length-k+1;i++)
	    {
	        min=Math.min(min,arr[i+k-1]-arr[i]);
	    }
	    return min;
	}
}
