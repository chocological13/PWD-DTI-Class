package src.day12;

import static java.util.Collections.sort;

import java.util.Arrays;

public class MergeSortedArray {
  // two integer arrays; nums1 and nums2
  // ascending
  // int m and int n representing the number of elements from nums1 and nums2 to be sorted
  // ! merge nums1 and nums2 in an ascending order
  // ! store the merged array in nums1
  // nums1 length = m + n, nums2 length = n

  public static void main(String[] args) {
    int[] nums1 = {2, 0};
    int[] nums2 = {1};
    int m = 1;
    int n = 1;

    merge(nums1, nums2, m, n);
  }

  public static void merge(int[] nums1, int[] nums2, int m, int n) {
    // (1) loop through nums 2
    // (2) replace nums1[m+i] with nums2[i]
    // (3) sort nums1

    for (int i = 0; i < n; i++) {
      nums1[m+i] = nums2[i];
    }

//    int nums1Len = m +n;
//    for (int i = 0; i < nums1Len; i++) {
//      int minIndex = i;
//      for (int j = i + 1; j < nums1Len; j++) {
//        if (nums1[j] < nums1[minIndex]) {
//          minIndex = j;
//        }
//      }
//      if (minIndex != i) {
//        int temp = nums1[i];
//        nums1[i] = nums1[minIndex];
//        nums1[minIndex] = temp;
//      }
//    }


    Arrays.sort(nums1);
    System.out.println(Arrays.toString(nums1));
  }
}
