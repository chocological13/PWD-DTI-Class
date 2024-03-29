package src.leetcodePractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class concatArray {

  public static void main(String[] args) {
    int[] num = {1, 2, 3};

    System.out.println(Arrays.toString(dupeCon(num)));

    Runtime rt = Runtime.getRuntime();

    long total_mem = rt.totalMemory();

    long free_mem = rt.freeMemory();

    long used_mem = total_mem - free_mem;

    System.out.println("Amount of used memory: " + used_mem);
  }
//  public static int[] concat(int[] num) {
//    int[] copy = num;
//    int[] ans = IntStream.concat(Arrays.stream(num), Arrays.stream(copy)).toArray();
//    return ans;
//  }

  public static int[] dupeCon(int[] num) {
    int[] copy = num;
    int[] ans = new int[2 * num.length];

    int index = 0;

    for (int item : num) {
      ans[index++] = item;
    }
    for (int item : copy) {
      ans[index++] = item;
    }

    return ans;
  }
}
