public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) 
    {
        if(A.size()==2)
        { 
           // if(A.get(0)>A.get(1))
             //{
             int temp=A.get(0);
                  A.set(0,A.get(1));
                  A.set(1,temp);
            //}
            return A;
        }
        int x=0;
        for(int i=A.size()-2;i>=0;i--)
        {
            if(A.get(i)<A.get(i+1))
            {
                x=i;
                for(int j=A.size()-1;j>x;j--)
                {
                    if(A.get(j)>A.get(x))
                    {
                        int temp=A.get(j);
                        A.set(j,A.get(x));
                        A.set(x,temp);
                        break;
                    }
                }
                break;
            }
        }
        if((x!=0)&&(A.size()>2))
        {   int j=A.size()-1;
        int i=x+1;
            while(i<=j)
            {
                int temp=A.get(j);
                A.set(j,A.get(i));
                A.set(i,temp);
                j--;
                i++;
            }
            return A;
        }
        
        Collections.sort(A);
        return A;
    }
}
