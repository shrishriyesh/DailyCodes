public class Solution {
    void dfs(int i,int start,int end,ArrayList<Integer> res){
        Stack<Integer> stack = new Stack<>();
        stack.push(i);
        while(!stack.isEmpty()){
            int intTemp = stack.pop();
            if(intTemp>=start&&intTemp<=end){
                res.add(intTemp);
            }
            else if(intTemp>end) continue;
            if(intTemp==0)return;
            int last=intTemp%10;
            if(last>0)
             stack.push(intTemp*10+(last-1));
             if(last<9)
            stack.push(intTemp*10+(last+1));
            }
        return;
    }
    public ArrayList<Integer> stepnum(int start, int end) {
    ArrayList<Integer> res = new ArrayList<>();
    for(int i=0;i<=9;i++){
       dfs(i,start,end,res);
    }
    Collections.sort(res);
    return res;
    }
}
