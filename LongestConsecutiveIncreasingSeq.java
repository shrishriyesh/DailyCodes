import java.util.*;
public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr)
    {HashMap <Integer, Integer>map=new HashMap<>();
     for(int i=0; i<arr.length;i++)
     map.put(arr[i],1);
     int max=arr[0];int maxc=1;
     for(int i=0;i<arr.length;i++)
     {
         int c=0;
         if(map.containsKey(arr[i]-1)==false)
         {int j=arr[i];
             while(map.containsKey(j))
             {
                 j++;
                 c++;
             }
          if(c>maxc)
          {
              maxc=c;
              max=arr[i];
          }
         }
     }
     ArrayList <Integer>num=new ArrayList<>();
     for(int i=0;i<maxc;i++)
     {
         num.add(max);
         max++;
     }
     return num;
		
	}
}
