/*
Q2. Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1


Input format :
Integer N (Total no. of rows)


<<<<<<< HEAD
Output format :sta
=======
Output format :
>>>>>>> origin/master
Pattern in N lines


Constraints :
0 <= N <= 50


Sample Input 1:
5


Sample Output 1:
55555
4444
333
22
1


Sample Input 2:
6


Sample Output 2:
666666
55555
4444
333
22
1

 */

package beginner_dsa.step0.pattren4;
import java.util.*;


public class question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<(n-i);j++)
            {
                System.out.print(n-i);
            }
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
