public class Solution {
    public int fibsum(int A) {
        if(A==0)
        return 0;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(1);
        int i=0;
        while(arr.get(i)+arr.get(i+1)<=A)
        {
            arr.add(arr.get(i)+arr.get(i+1));
            i++;
        }
        return 1+fibsum(A-arr.get(arr.size()-1));
    }
}
