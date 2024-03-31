package src.leetcodePractice;

public class IndexOfFirstOccurence_superBruteForce {

  public static void main(String[] args) {
    String haystack = "applejam";
    String needle = "jam";

    System.out.println(strStr(haystack, needle));
  }

  public static int strStr(String haystack, String needle) {

    // (1) Look for if the character in the haystack matches with the first character in needle
    // (2) When it matches, check if the next character matches until the end of needle
    // (3) If it doesn't, go back and check if there's any other occurrence

    // initialize occurrence at -1 (because we return -1 if not found)
    int occur = -1;

    for (int i = 0; i < needle.length(); i++) {
      for (int j = 0; j < haystack.length(); j++) {
        if (occur == -1) {
          if (needle.charAt(i) == haystack.charAt(j)) {
            occur = j;
          }
        } else {
          if (needle.charAt(j - occur) != haystack.charAt(j)) {
            occur = -1;
            break;
          } else if (j - occur == needle.length() - 1) {
            return occur;
          }
        }
      }
    }
    return occur;
  }

}
