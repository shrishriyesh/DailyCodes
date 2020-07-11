public class Solution {
   // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        //Array
        int k=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<A.size();i++)
        {
            String str=A.get(i);
            char arr[]=str.toCharArray();
            Arrays.sort(arr);
            str=new String(arr);
            if(!map.containsKey(str))
            {
                map.put(str,k);
                k++;
                ArrayList<Integer> out=new ArrayList<>();
                out.add(i+1);
                res.add(out);
            }
            else
            {
                int pos=map.get(str);
                ArrayList<Integer> temp =res.get(pos);
                temp.add(i+1);
                res.set(pos,temp);
            }
        }
        return res;
    }
  
}
