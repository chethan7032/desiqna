/*
Print the following pattern for the given N number of rows.
Pattern for N = 4

The dots represent spaces.
Input format :
Integer N (Total no. of rows)


Output format :
Pattern in N lines


Constraints
0 <= N <= 50


Sample Input 1:
3


Sample Output 1:
     1
    12
  123


Sample Input 2:
4


Sample Output 2:
     1
    12
  123
1234

 */


package beginner_dsa.step0.pattren4;
import java.util.*;

public class question1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n valure");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<(n-(i+1));j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<(i+1);k++)
            {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
