public class Solution {
    public int isPower(int A) 
    {   if(A==0||A==1)
    return 1;
        for(int i=2;i*i<=A;i++)
        {
            for(int y=2;y<=A/i;y++)
            {
                if((int)Math.pow(i,y)==A)
                return 1;
                if((int)Math.pow(i,y)>A)
                break;
            }
        }
        return 0;
    }
}
