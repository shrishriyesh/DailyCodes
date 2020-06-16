public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) 
    {   int k=0;int i=0;
        while(i<a.size())
        {   
            if(((i+2)<a.size())&&((int)a.get(i)==(int)a.get(i+2)))
            {
                i++;
            }
            else
            {
            a.set(k,(int)a.get(i));
            i++;k++;
        }}
        return k;
    }

}

