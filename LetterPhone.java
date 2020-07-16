public class Solution {
public ArrayList letterCombinations(String A) {
ArrayList<String> ar= new ArrayList<>();
ArrayList<String> num= new ArrayList(Arrays.asList(A.split("")));
ArrayList<Integer> numb= new ArrayList<>();
int n=num.size();
for(int i=0;i<n;i++){
numb.add(Integer.parseInt(num.get(i)));
}

    ar.add("0");
    ar.add("1");
    ar.add("abc");
    ar.add("def");
    ar.add("ghi");
    ar.add("jkl");
    ar.add("mno");
    ar.add("pqrs");
    ar.add("tuv");
    ar.add("wxyz");
    ArrayList<String> all = new ArrayList<>();
    String sub = new String("");
    
    generate(all, numb, ar, sub, 0,0);
    return all;
}
public void generate(ArrayList<String> all, ArrayList<Integer> numb, ArrayList<String> ar, String sub, int index, int subind){
    if(sub.length()==numb.size()){
        all.add(sub);
    }
    if(index>=numb.size()){
        return;
    }
    for(int j=subind;j<ar.get(numb.get(index)).length();j++ ){
        sub+=ar.get(numb.get(index)).charAt(j);
        generate(all, numb, ar, sub, index+1,0);
        sub=sub.substring(0,sub.length()-1);
        
    }
}
}
