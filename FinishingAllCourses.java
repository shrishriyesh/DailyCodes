public class Solution {
    public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
        ArrayList<ArrayList<Integer>> l=new ArrayList<>();
        for(int i=0;i<A;i++){
            l.add(new ArrayList<Integer>());
        }
        int[] arr=new int[A];
        for(int i=0;i<B.size();i++){
            l.get(B.get(i)-1).add(C.get(i)-1);
            arr[C.get(i)-1]=arr[C.get(i)-1]+1;
        }
        LinkedList<Integer> q=new LinkedList<>();
        for(int i=0;i<A;i++){
            if(arr[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            Integer n=q.pollFirst();
            count++;
            for(Integer i:l.get(n)){
                arr[i]=arr[i]-1;
                if(arr[i]==0){
                    q.add(i);
                }
            }
        }
        return count==A?1:0;        
    }
}
