public class Solution {
  public ArrayList<Integer> generateParenthesis(int A) {
    ArrayList<Integer> al =new ArrayList();
    generate(al,"",A,A);
    return al;
  }
  static void generate(ArrayList<Integer> al,String s,int l,int r){ 
    if(l==0 && r==0){
      al.add(s);
      return;
    }
    if(l<0 || r<0 || l>r){
      return;
    }
    generate(al,s+"(",l-1,r);
    generate(al,s+")",l,r-1);
  }
}
