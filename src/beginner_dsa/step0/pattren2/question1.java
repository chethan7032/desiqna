
/*
Question 1.
for n=3
pattern is
1
2 2
3 3 3

for n=5
pattern is
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
now print for n=6!!




 */
package beginner_dsa.step0.pattren2;
import java.util.*;
public class question1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value either 3 or 5");
      int n= sc.nextInt();
      if(n==3)
      {
          for(int i=0;i<=2;i++)
          {
              for(int j=0;j<i+1;j++)
              {
                  System.out.print(i+1+" ");
              }
              System.out.println();
          }
      } else if (n==5) {

          for(int i=0;i<=4;i++)
          {
              for(int j=0;j<i+1;j++)
              {
                  System.out.print(i+1+ " ");
              }
              System.out.println();
          }

      }


    }
}
