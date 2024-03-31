package src.leetcodePractice;

public class IndexOfFirstOccurrence_BruteForce {

  public static void main(String[] args) {
    String haystack = "leetcode";
    String needle = "leeto";

    System.out.println(strStr(haystack, needle));
  }

  public static int strStr(String haystack, String needle) {

    // (1) Look for if the character in the haystack matches with the first character in needle
    // (2) When it matches, check if the next character matches until the end of needle
    // (3) If it doesn't, go back and check if there's any other occurrence

    // initialize occurrence at -1 bc that's what we will return if no match is found
    int occur = -1;

    // loop through haylen-needlen+1 so that it doesn't go out of bound later when we do comparison
    for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {

      // loop through needle to see if a match is found
      for (int j = 0; j < needle.length(); j++) {

        // compare the char of haystack at (i + j) with char of needle at (j)
        if (haystack.charAt(i + j) == needle.charAt(j)) {
          // if it's a match, we save the index i as occur
          occur = i;

          // if it's not a match before the j loop ends, it means not all char in needle is found
          // so we go back to occur = -1
        } else {
          occur = -1;
          break;
        }
      }
      if (occur != -1)
        return occur;
    }
    return occur;
  }
}
