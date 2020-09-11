/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void func(int arr[], int n) 
	{ 
		int i = 0; 
		Stack<Integer> s = new Stack<>(); 
		//s.top = -1; 
		//int element, next; 

		s.push(0); 

		for (i = 1; i <n; i++) 
		{ 
			while(!s.isEmpty()&&arr[s.peek()]<arr[i])
            {
              arr[s.pop()]=arr[i];
            }
          s.push(i);
		} 

		while (s.isEmpty() == false) 
		{ 
			arr[s.pop()]=-1;
			
		} 
      for(i=0;i<n;i++)
      {
        System.out.print(arr[i]+" "); 
      }
	}  
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int s=sc.nextInt();
	        int arr[]=new int[s];
	        for(int j=0;j<s;j++)
	        {
	            arr[j]=sc.nextInt();
	        }
	        func(arr,s);
	        System.out.println("");
	    }
		
	}
}
