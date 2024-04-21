/* check if the given array is subset of another array, assume that duplication is not allowed*/

package prequisites.hashing.part4;
import java.util.*;
public class Array_subset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array1");
        int n=sc.nextInt();
        System.out.println("enter array1 but duplication is not allowed");
        int array1[]=new int[n];
       for (int i=0;i<n;i++)
       {
           array1[i]=sc.nextInt();
       }
        System.out.println("enter subset array size");
        int m= sc.nextInt();
        System.out.println("enter subset array");
        int array2[]=new int[m];
        for (int i=0;i<m;i++)
        {
            array2[i]=sc.nextInt();
        }

        Set<Integer> cset=new HashSet<>();
        for (int a:array1) {

              cset.add(a);

        }

        for (int a:array2) {
            if(!cset.contains(a))
            {
                System.out.println("array2 is not subset of array1");
                return;
            }





        }
        System.out.println("arr2 is subset of arr1");

    }
}
