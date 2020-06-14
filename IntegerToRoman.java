public class Solution {
    public String intToRoman(int A) {
        String thousand[]={"","M","MM","MMM"};
        String hundered[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String tens[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String ones[]={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        int a=A/1000;
        A=A%1000;
        int b=A/100;
        A=A%100;
        int c=A/10;
        A=A%10;
        
        return thousand[a]+hundered[b]+tens[c]+ones[A];
    }
}
