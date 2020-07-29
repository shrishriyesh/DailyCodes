
import java.util.*;


public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();

		
		 int edge[][]=new int[V][V];
        for(int i=0;i<E;i++)
        {
            int f=sc.nextInt();
            int s=sc.nextInt();
            edge[f][s]=1;
            edge[s][f]=1;
        }
       /* if(edge[sv][ev]==1)
        {System.out.print(true);
        return;}*/
       boolean visit[]=new boolean[edge.length];
        helper(edge,visit,0);
        for(int i=0;i<edge.length;i++)
        {
            if(visit[i]==false)
            {    System.out.print("false");
            return;}
        }
        System.out.print("true");
        }
       public static void helper(int edge[][],boolean visit[],int s)
        {	
            visit[s]=true;
            for(int i=0;i<edge.length;i++)
            {if((edge[s][i]==1)&&(visit[i]!=true))
            {
                            visit[i]=true;
                helper(edge,visit,i);
            }
            }
        }
}
