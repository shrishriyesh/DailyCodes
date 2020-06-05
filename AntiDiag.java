public class Solution {
    public int[][] diagonal(int[][] A) {
        int l=(2*A.length)-1;
        int arr[][]=new int[l][];
        int i=0;
        int q=i;
        for(i=0;i<A[0].length;i++)
        {
            arr[i]=new int[i+1];
            q=i;
        }
        i=q;
        for(;q>0;q--)
        {
            i++;
            arr[i]=new int[q];
        }
        int x=0;
        int y=0;
        for(i=0;i<A.length;i++)
        {   
            x=0;y=i;
            for(int j=0;j<arr[i].length;j++)
            {
             arr[i][j]=A[x][y];
             x+=1;
             y-=1;
            }
        }
        int z=1;
        for(;i<l;i++)
        {   
            x=z;y=A[0].length-1;
            for(int j=0;j<arr[i].length;j++)
            {
             arr[i][j]=A[x][y];
             x+=1;
             y-=1;
            }
            z++;
        }
     return arr;   
    }
}
