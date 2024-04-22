
/*
Find out the pair from array whose sum forms the number 'x' when both the numbers of the pair are added


Hashing

As we see the above Brute-Force approach, it will work good for small size of array but for large size it will be inefficient in terms
of computing the problem so we need to optimise the solution to the problem.
 We can do this using hashing, In this problem we will use set which will help us in maintaining the elements presence and help in accessing
 them faster.

So basically, we will use a single 'for' loop in which for iteration we will take the difference of 'x' and 'arr[i]' and check if that
difference value is present in the set . We are using set(unordered_set) as HashTable in this problem.

Algorithm:

 Take input for array 'arr' and number 'x'.
 Declare the set as pairSet.
 Enter inside the for loop from i = 0 till i < size
 Take the difference of 'x' and 'arr[i]' and store it in 'temp'.
 check if 'temp' value is present in pairSet till end, if it's present then return 0 (means true)then jump to point 8.
 If point 5 is false then repeat insert the value of 'arr[i]' in the pairSet and repeat the point 3.
 If we reach till this point return -1(indicating false).
 End the program.
 */

package prequisites.hashing.part8;
import java.util.*;
public class array_pair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array sze");
        int n=sc.nextInt();
        System.out.println("enter array elements");
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the x value");
        int x=sc.nextInt();

        if(haspairwithsum(arr,x))
        {
            System.out.println("array contains pair with sum :"+x);
        }
        else
        {
            System.out.println("array doesnt contains the pair");
        }


    }
    public static  boolean haspairwithsum(int arr[],int x)
    {
        Set<Integer> pairset =new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            int temp=x-arr[i];
            if(pairset.contains(temp))
            {
                return true;
            }
            pairset.add(arr[i]);
        }
        return  false;
    }


}
