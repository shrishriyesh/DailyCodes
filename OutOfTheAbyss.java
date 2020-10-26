/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   try{
			 Scanner sc=new Scanner(System.in);
        int n=0;
        if(sc.hasNextInt()){
        n= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int node=sc.nextInt();
            int e=sc.nextInt();
            int k=sc.nextInt();
            int G[][]=new int[node][node];
            for(int j=0;j<e;j++)
            {
            int f=sc.nextInt();
            int s=sc.nextInt();
            G[f][s]=1;
            G[s][f]=1;
            }
            boolean star[]=new boolean[node];
            for(int j=0;j<k;j++)
            {   int x=sc.nextInt();
                star[x]=true;
            }
            int q=sc.nextInt();
            int queries[]=new int[q];
            for(int j=0;j<q;j++)
            queries[j]=sc.nextInt();
            func(G,node,star,queries);
        }
		}catch(Exception e){
			return;
		}
       
	}
	public static void func(int G[][],int n,boolean star[],int queries[])
	{
	    for(int i=0;i<queries.length;i++)
	    {
	        helper(G,n,star,queries[i]);
	    }
	}
	public static void helper(int G[][],int n,boolean star[],int q)
	{
	    boolean vis[]=new boolean[n];
	    int d=0;
	    Queue<Integer> qu=new LinkedList<>();
	    qu.add(q);
	    while(!qu.isEmpty())
        {   int l=qu.size();
            for(int j=0;j<l;j++)
            {
            int node=qu.poll();
            if(star[node])
            {
                System.out.println(d);
                return;
            }
            
            if(!vis[node])
            {
                vis[node]=true;
                for(int i=0;i<n;i++)
                {
                    if(G[node][i]==1&&vis[i]==false)
                    qu.add(i);
                }
            }
        }
        d++;
        }
	    System.out.println("-1");
	}
}
