/*Minimum operations to make all elements equal in an array.*/

/*
logic is

Let's say the element with the highest frequency occurs k times.
Thus, we would require at least n-k operations for making all the array elements equal.
Here n is the size of the array.

 */

package prequisites.hashing.part6;
import java.util.*;

public class minimum_operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min_operations=0;
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();

        }
        Map<Integer,Integer> cmap=new HashMap<>();
        for (int a:arr) {
            cmap.put(a,cmap.getOrDefault(a,0)+1);

        }
        int target=0;
        int count=0;
        for (int a:cmap.values()) {
            if(a>target)
            {
                target=a;
                count++;

            }

        }
        System.out.println(min_operations=size-count);


    }
}
