/*
 Check if a given array is a subset of another array. Duplicate elements can be present.
 */
package prequisites.hashing.part5;

import java.util.*;

public class aArray_subset_with_duplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array1:");
        int n = sc.nextInt();
        System.out.println("Enter array1:");
        int array1[] = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter subset array size:");
        int m = sc.nextInt();
        System.out.println("Enter subset array:");
        int array2[] = new int[m];
        for (int i = 0; i < m; i++) {
            array2[i] = sc.nextInt();
        }

        Map<Integer, Integer> cmap = new HashMap<>();
        for (int a : array1) {
            cmap.put(a, cmap.getOrDefault(a, 0) + 1);
        }

        boolean isSubset = true;
        for (int a : array2) {
            if (!cmap.containsKey(a)) {
                isSubset = false;
                break;
            }
        }

        if (isSubset) {
            System.out.println("array2 is a subset of array1.");
        } else {
            System.out.println("array2 is not a subset of array1.");
        }
    }
}
