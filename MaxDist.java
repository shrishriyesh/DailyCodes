public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
    //   int j=A.size()-1;
    //     for(int i=0;i<A.size();i++)
    //     {
    //         if(i>j)
    //         {
    //             return -1;
    //         }
    //         if(A.get(j)-A.get(i)>=0)
    //         {
    //             return j-i;
    //         }
    //         j--;
    //     }
    //     return -1;
    // }
    int min[]=new int[A.size()];
    int max[]=new int[A.size()];
    min[0]=A.get(0);
    for(int i=1;i<A.size();i++)
    {
        min[i]=Math.min(min[i-1],A.get(i));
    }
    max[A.size()-1]=A.get(A.size()-1);
    for(int i=A.size()-2;i>=0;i--)
    {
        max[i]=Math.max(A.get(i),max[i+1]);
    }
    int i=0;
    int j=0;
    int maxdiff=-1;
    while(i<A.size()&&j<A.size())
    {
        if(max[j]>=min[i])
        {
         maxdiff=Math.max(maxdiff,j-i);
         j++;
        }
        else
        i++;
    }
    return maxdiff;
}
}
