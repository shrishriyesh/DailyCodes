public class Solution {
    public int removeElement(ArrayList<Integer> a, int b){
        int j=0;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)!=b)
            {
                a.set(j,a.get(i));
                j++;
            }
        }
        for(int i=j;i<a.size();i++)
        {
            a.remove(i);
        }
        return j;
    } 
//     {   a.removeAll(Arrays.asList(b));
// return a.size();
}
