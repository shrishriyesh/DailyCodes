public class Solution {
    public int maximalRectangle(int[][] A) 
    {
        int dp[]=new int[A[0].length];
        for(int i=0;i<A[0].length;i++)
        dp[i]=A[0][i];
        int maxArea=MaxHist(dp);
        for(int i=1;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                if(A[i][j]==0)
                {dp[j]=0;
                continue;}
                dp[j]+=A[i][j];
            }
            maxArea=Math.max(maxArea,MaxHist(dp));
        }
        return maxArea;
    }
    public int MaxHist(int dp[])
    {
        Stack<Integer> st=new Stack<>();
        int max=Integer.MIN_VALUE;
        int i=0;
        for(;i<dp.length;i++)
        {
            if(st.isEmpty()||dp[i]>=dp[st.peek()])
            st.push(i);
            else
            {
                while(!st.isEmpty()&&dp[i]<dp[st.peek()])
                {
                    int pos=st.pop();
                    if(!st.isEmpty())
                    {
                        int area=dp[pos]*(i-st.peek()-1);
                        max=Math.max(area,max);
                    }
                    else
                    {
                        int area=dp[pos]*(i);
                        max=Math.max(area,max);
                    }
                }
                st.push(i);
            }
        }
        while(!st.isEmpty())
        {
            int pos=st.pop();
              if(!st.isEmpty())
                    {
                        int area=dp[pos]*(i-st.peek()-1);
                        max=Math.max(area,max);
                    }
                    else
                    {
                        int area=dp[pos]*(i);
                        max=Math.max(area,max);
                    }
        }
        return max;
        
    }
}
