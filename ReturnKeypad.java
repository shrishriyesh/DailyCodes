import java.io.*;
import java.util.*;
public class solution {

	static String map[]={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static ArrayList<String> out= new ArrayList<>();
	public static String[] keypad(int ni){
		String n=Integer.toString(ni);
        lettercomb(n,"",0);
        String arr[]=new String[out.size()];
        for(int i=0;i<out.size();i++)
            arr[i]=out.get(i);
        return arr;
	}
	public static void lettercomb(String dig, String str, int in)
    {
        if(in==dig.length())
        {
            out.add(str);
            return;
        }
        String letters=map[dig.charAt(in)-'0'];
        for(int i=0;i<letters.length();i++)
        {
            lettercomb(dig,str+letters.charAt(i),in+1);
        }
    }
}
