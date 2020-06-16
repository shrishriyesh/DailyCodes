public class Solution {
    public void sortColors(ArrayList<Integer> a) 
    {int x=0;int y=0;int z=0;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)==0)
            x++;
            else if(a.get(i)==1)
            y++;
            else
            z++;
        }
        int k=0;
        while(k<x)
        {
            a.set(k,0);
            k++;
        }
        while(k<x+y)
        {
            a.set(k,1);
            k++;
        }
        while(k<x+y+z)
        {
            a.set(k,2);
            k++;
        }
    }
}
