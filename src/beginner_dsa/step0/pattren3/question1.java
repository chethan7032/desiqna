/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
B C
C D E
D E F G

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 13

Sample Input 1:
5

Sample Output 1:
A
B C
C D E
D E F G
E F G H I

Sample Input 2:
6

Sample Output 2:
A
B C
C D E
D E F G
E F G H I
F G H I J K

find for n=9

 */


package beginner_dsa.step0.pattren3;
import java.util.*;

public class question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value ranging from 3 to 9");
        int n=sc.nextInt();
        switch (n)
        {
            case 3:
                for(int i=0;i<=3;i++)
                {
                    for(int j=i;j <2*i; j++)
                    {
                        System.out.print((char)(64+j)+" ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for(int i=0;i<=4;i++)
                {
                    for(int j=i;j <2*i; j++)
                    {
                        System.out.print((char)(64+j)+" ");
                    }
                    System.out.println();
                }
                break;
            case 5:
                for(int i=0;i<=5;i++)
                {
                    for(int j=i;j <2*i; j++)
                    {
                        System.out.print((char)(64+j)+" ");
                    }
                    System.out.println();
                }
                break;
            case 6:
                for(int i=0;i<=6;i++)
                {
                    for(int j=i;j <2*i; j++)
                    {
                        System.out.print((char)(64+j)+" ");
                    }
                    System.out.println();
                }
                break;
            case 7:
                for(int i=0;i<=7;i++)
                {
                    for(int j=i;j <2*i; j++)
                    {
                        System.out.print((char)(64+j)+" ");
                    }
                    System.out.println();
                }
                break;
            case 8:
                for(int i=0;i<=8;i++)
                {
                    for(int j=i;j <2*i; j++)
                    {
                        System.out.print((char)(64+j)+" ");
                    }
                    System.out.println();
                }
                break;
            case 9:
                for(int i=0;i<=9;i++)
                {
                    for(int j=i;j <2*i; j++)
                    {
                        System.out.print((char)(64+j)+" ");
                    }
                    System.out.println();
                }
                break;

        }
    }

}
