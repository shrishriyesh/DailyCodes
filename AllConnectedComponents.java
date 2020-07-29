import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int Edges[][]=new int[V][V];
        for(int i=0;i<E;i++)
        {
            int fv=s.nextInt();
            int ev=s.nextInt();
            Edges[fv][ev]=1;
            Edges[ev][fv]=1;
        }
        ArrayList<ArrayList<Integer>> out=new ArrayList<>();
        helper(out,Edges);
        for(int i=0;i<out.size();i++)
        {
            for(int j=0;j<out.get(i).size();j++)
            {
                System.out.print(out.get(i).get(j)+" ");
            }
            System.out.println();
        }
        }
    public static void helper(ArrayList<ArrayList<Integer>> out, int Edges[][])
    {
		boolean visited[]=new boolean[Edges.length];
        for(int i=0;i<Edges.length;i++)
        {	if(!visited[i])
        {	ArrayList<Integer> res=new ArrayList<>();
            helper2(visited,Edges,i,res);
         	Collections.sort(res);
            out.add(res);
        }
        }
    }
    public static void helper2(boolean vis[],int Edges[][],int s,ArrayList<Integer> res)
    {
        res.add(s);
        vis[s]=true;
        for(int i=0;i<Edges.length;i++)
        {
            if(Edges[s][i]==1&&vis[i]==false)
                helper2(vis,Edges,i,res);
        }
    }
}
