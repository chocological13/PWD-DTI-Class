package src.leetcodePractice;

public class CountAndSay {

  public static void main(String[] args) {
    int n = 10;

    System.out.println(countAndSay(n));
  }

  public static String countAndSay(int n) {
    if (n == 1) {
      return "1";
    } else {
      // we say the previous string
      String prevSay = countAndSay(n - 1);

      // initialize a var to hold the count
      // 1 because there will at least be one count
      int count = 1;

      StringBuilder nowSay = new StringBuilder();

      // iterate through string 'prevSay' and count how many times a unique digit occurs
      for (int i = 0; i < prevSay.length(); i++) {
        if (i + 1 < prevSay.length() && prevSay.charAt(i) == prevSay.charAt(i + 1)) {
          count++;
        } else {
          nowSay.append(count).append(prevSay.charAt(i));
          // count back to 1
          count = 1;
        }
      }
      return nowSay.toString();
    }
  }
}
