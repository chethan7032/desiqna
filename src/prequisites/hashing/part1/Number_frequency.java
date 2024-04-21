package prequisites.hashing.part1;
import java.util.*;
public class Number_frequency {
    public static void main(String[] args) {


   int[] a ={1,2,3,1,2,3,5,2,1,2};

        int n = a.length;
        int b[]=new int[n];
   int i=0;
   while(i<a.length)
    {
        int x=a[i];
        b[x]++;
        i++;

    }


   int quesries[]={2,5,3};
   int j=0;
   while (j<(quesries.length))
   {
       int y=quesries[j];
       System.out.println(b[y]);
       //System.out.println(" ,");
       j++;
   }



}
}
