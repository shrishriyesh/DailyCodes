public class Solution {
    public long reverse(long a) 
    {
        String s=Long.toBinaryString(a);

int c=32-s.length();
for(int i=0;i<c;i++)
s='0'+s;
String rev="";
for(int i=31;i>=0;i--)
rev+=s.charAt(i);
long l=Long.parseLong(rev,2);
return l;
}
    
}
