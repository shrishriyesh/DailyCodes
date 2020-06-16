public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) 
    {   if(a.size()<=1)
    return 1;
        
        int i=0;int j=0;
        while(i<a.size()-1)
        {
            if((int)a.get(i)==(int)a.get(i+1))
            {
                i++;
                continue;
            }
            else
            {
                a.set(j,a.get(i));
                j++;
                i++;
            }
            
        }
        a.set(j,a.get(i));
        // for(int k=j+1;k<a.size();k++)
        // a.remove(k);
        return j+1;
//         int size = a.size();
// int curIndex=0;

//     for(int i=0; i<size; i++){
//         if(!(a.get(i).equals(a.get(curIndex)))){
//             a.set(++curIndex, a.get(i));
//     }
   
// }
//return curIndex+1;
    }
}
