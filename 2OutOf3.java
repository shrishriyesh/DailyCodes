public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) 
    {   HashMap<Integer,Integer> map1=new HashMap<>();
    HashMap<Integer,Integer> map2=new HashMap<>();
    HashMap<Integer,Integer> map3=new HashMap<>();
    HashSet<Integer> h = new HashSet<Integer>();
    ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<A.size();i++)
        {
            map1.put(A.get(i),1);
        }
        for(int i=0;i<B.size();i++)
        {
            map2.put(B.get(i),1);
            if(map1.containsKey(B.get(i)))
            {
                if(!h.contains(B.get(i)))
                arr.add(B.get(i));
                h.add(B.get(i));
            }
            
        }
        for(int i=0;i<C.size();i++)
        {
            map3.put(C.get(i),1);
            if(map1.containsKey(C.get(i))||(map2.containsKey(C.get(i))))
            {   
                if(!h.contains(C.get(i)))
                arr.add(C.get(i));
                h.add(C.get(i));
                
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
