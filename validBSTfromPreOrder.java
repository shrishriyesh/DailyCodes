public class Solution {
    public int solve(ArrayList<Integer> A) 
    {
        int a=0;int b=1;int c=2;
        if(A.size()<=2)
        return 1;
        while(c<A.size())
        {
            if(A.get(a)<A.get(b)&&A.get(b)>A.get(c)&&A.get(c)<A.get(a))
            return 0;
            a++;b++;c++;
        }
        return 1;
    }
}
