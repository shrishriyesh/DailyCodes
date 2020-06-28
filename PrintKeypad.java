public class solution {
    static String map[]={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void printKeypad(int input){
		String dig=Integer.toString(input);
		recpad(input,"");
	}
    public static void recpad(int in,String out)
    {
        if(in<=0)
        {
            System.out.println(out);
            return;
        }
        else
        { String letters=map[(in%10)];
            recpad(in/10,letters.charAt(0)+out);
         recpad(in/10,letters.charAt(1)+out);
        recpad(in/10,letters.charAt(2)+out);
         if((in%10==7)||(in%10==9))
         recpad(in/10,letters.charAt(3)+out);
         }
    }
}
