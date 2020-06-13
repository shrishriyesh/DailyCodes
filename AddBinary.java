import java.math.BigInteger; 
public class Solution {
    public String addBinary(String A, String B) {
        //Equalising lengths of Binary Nos.
        int a=A.length()-1;
        int b=B.length()-1;
        while(a>b)
        {
            B="0"+B;
            b++;
        }
        while(b>a)
        {
            A="0"+A;
            a++;
        }
        String C="";
        int carry=0;
        //Adding up each digit with four cases of (0,0)/(0,1)/(1,0)/(1,1) considering all carry
        while(b>=0&&a>=0)
        {
            char one=A.charAt(a);
            char two=B.charAt(b);
            a--;
            b--;
            if(one=='0'&&two=='0')
            {
                if(carry==1)
                {
                    C="1"+C;
                    carry=0;
                }
                else
                C="0"+C;
            }
            else if((one=='1'&&two=='0')||(one=='0'&&two=='1'))
            {
                if(carry==1)
                {
                    C="0"+C;
                    carry=1;
                }
                else
                {
                    C="1"+C;
                    carry=0;
                }
            }
            else
            {
                if(carry==1)
                {
                    C="1"+C;
                    carry=1;
                }
                else
                {
                    C="0"+C;
                    carry=1;
                }
            }
        }
        if(carry==1)
        C="1"+C;
        return C;
    }
    // public class Solution {
    // public String addBinary(String A, String B) {
    //     BigInteger b1=new BigInteger(A,2);
    //     BigInteger b2=new BigInteger(B,2);
    //     return (b1.add(b2)).toString(2);
    // }
}
