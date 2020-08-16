import java.io.*;
import java.util.*;
public class Solution {
	//static ArrayList<Integer> out=new ArrayList<>();
	//static int res=0;
	public static int countWaysToMakeChange(int deno[], int value){
        //minimum ways to make coin change
// 	int dp[]=new int[value+1];
//         dp[0]=0;
//         for(int i=1;i<value+1;i++)
//         {
//             dp[i]=Integer.MAX_VALUE;
//         }
//         for(int i=1;i<dp.length;i++)
//         {
//             for(int j=0;j<deno.length;j++)
//             {
//                 if(i-deno[j]<0)
//                     continue;
//                 dp[i]=Math.min(dp[i-deno[j]]+1,dp[i]);
//             }
                
//         }
//         return dp[value];
        return helper(deno,value);
	}
    public static int helper(int deno[],int val)
    {
        int arr[][]=new int[deno.length+1][val+1];
        //when value to be made is 0, only 1 way is there to from it, by excluding any coins.
        for(int i=0;i<arr.length;i++)
        {
            arr[i][0]=1;
        }
        //when no denominations used, you can only create a value of 0  in one way and no other value
        for(int i=1;i<arr[0].length;i++)
        {
            arr[0][i]=0;
        }
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                if(j-deno[i-1]<0)
                arr[i][j]=arr[i-1][j];
                else
                arr[i][j]=arr[i-1][j]+arr[i][j-deno[i-1]];
            }
        }
        return arr[arr.length-1][arr[0].length-1];
    }	
}
