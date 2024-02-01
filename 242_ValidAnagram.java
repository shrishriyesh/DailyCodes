import java.io.*;
import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            if(hm.containsKey(t.charAt(i)) && hm.get(t.charAt(i))>0)
            hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
            else
            return false;
        }
        boolean fl=true;
        for(int i=0;i<s.length();i++)
        {
            if(hm.get(s.charAt(i))!=0)
            fl=false;
        }
        return fl;
    }
}