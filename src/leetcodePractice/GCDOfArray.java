package src.leetcodePractice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GCDOfArray {

  public static void main(String[] args) {
    int[] n = {7, 5, 6, 8, 3};

    System.out.println(findGCD(n));
  }

  public static int findGCD(int[] nums) {
    // sort array
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if(nums[i] > nums[j]) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
    }

    int smallest = nums[0];
    int largest = nums[nums.length-1];
    int gcd = 1; // initialize var gcd to store gcd, the default is 1

    // find gcd by looping through mod both min and max int
    // mod both of them and see which one would be 0 using the same index as mod
    // start from 1 to <=smallest so it starts at 1
    for (int i = 1; i <= smallest; i++) {
      if (smallest % i == 0 && largest % i == 0) {
        gcd = i;
      }
    }

    return gcd;
  }

}
