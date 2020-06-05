package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI-GV62-7RD
 */
import java.io.*;
import java.util.*;
public class MinStepsInInfiniteGrid {
     public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) 
    {   int steps=0;
        int l=A.size();
        for(int i=1;i<l;i++)
        {
            // while((A.get(i-1)!=A.get(i))&&(A.get(i-1)!=A.get(i)))
            // {   int stA=A.get(i-1);
            //     int enA=A.get(i);
            //     if(stA<enA)
            //     {
            //         A.set(i-1,stA+1);
            //     }
            //     if(stA>enA)
            //     {
            //         A.set(i-1,stA-1);
            //     }
            //     int stB=A.get(i-1);
            //     int enB=A.get(i);
            //     if(stB<enB)
            //     {
            //         B.set(i-1,stB+1);
            //     }
            //     if(stB>enB)
            //     {
            //         B.set(i-1,stB-1);
            //     }
            //     steps++;
            // }
            steps=steps+Math.max(Math.abs(A.get(i)-A.get(i-1)),Math.abs(B.get(i)-B.get(i-1)));
        }
        return steps;
    }
     public static void main(String Args[])
     {
         
     }
}
