package prequisites.hashing.part3;
import java.util.*;

public class part1_in_hashtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter number of queries");
        int q = sc.nextInt();
        int queries[] = new int[q];
        System.out.println("enter queries");
        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextInt();
        }

        Map<Integer, Integer> cmap = new HashMap<>();

        // Count frequency of each number in the array
        for (int i = 0; i < n; i++) {
            if (cmap.containsKey(a[i])) {
                cmap.put(a[i], cmap.get(a[i]) + 1);
            } else {
                cmap.put(a[i], 1);
            }
        }

        // Print frequency of numbers based on queries
        for (int que : queries) {
            if (cmap.containsKey(que)) {
                System.out.println(cmap.get(que));
            } else {
                System.out.println("0");
            }
        }
    }
}
