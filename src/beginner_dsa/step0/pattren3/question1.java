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

 */
package beginner_dsa.step0.pattren3;

public class question1 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
}
