/*
print these pattren
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

package beginner_dsa.step0.pattren2;

public class question1_1 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
