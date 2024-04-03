package src.day12;

import java.util.Arrays;

public class MergeSortedArray_TwoPointer {

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    int m = 3;
    int n = 3;

    merge(nums1, nums2, m, n);
  }

  public static void merge(int[] nums1, int[] nums2, int m, int n) {
    // make 3 pointer to m(el of nums1), n(el of nums2), m+n(length of nums1)
    // loop while we still have nums2 (n)
    // if nums1 at the pointer of m is greater than the nums2 at pointer of n
    // swap nums1 at pointer m+n and nums1 at pointer m;
    // decrement pointer m and m+n
    // else swap nums1 at pointer k and nums2 at pointer n;
    // decrement pointer m+n and n

    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;

    while (j >= 0) {
      if (i >= 0 && nums1[i] > nums2[j]) {
        nums1[k--] = nums1[i--];
      } else {
        nums1[k--] = nums2[j--];
      }
    }

    System.out.println(Arrays.toString(nums1));
  }
}
