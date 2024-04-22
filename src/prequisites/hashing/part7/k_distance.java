/*
Check if the given array contains duplicate elements within k distance from each other

Algorithm:

While traversing an array from left to right we need to consider two situations.

1]   If the array element is already present in our map then get its position from a map and calculate the difference
between the current index and the position that we have fetched from the map.

        -> if the difference is greater than k then update the position of the current element in the map

        -> if the difference is less than k then simply return true.



2]   If the array element is not present in our map then just insert it with its index.



 */


package prequisites.hashing.part7;
import java.util.*;



        public class k_distance {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the size of the array:");
                int n = sc.nextInt();
                int[] nums = new int[n];

                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < n; i++) {
                    nums[i] = sc.nextInt();
                }

                System.out.println("Enter the value of k:");
                int k = sc.nextInt();

                if (containsNearbyDuplicate(nums, k)) {
                    System.out.println("The array contains duplicate elements within " + k + " distance.");
                } else {
                    System.out.println("The array does not contain duplicate elements within " + k + " distance.");
                }
            }

            public static boolean containsNearbyDuplicate(int[] nums, int k) {
                Map<Integer, Integer> map = new HashMap<>();

                for (int i = 0; i < nums.length; i++) {
                    if (map.containsKey(nums[i])) {
                        int j = map.get(nums[i]);
                        if (i - j <= k) {
                            return true;
                        }
                    }
                    map.put(nums[i], i);
                }
                return false;
            }
        }





