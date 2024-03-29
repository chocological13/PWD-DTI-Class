package src.leetcodePractice;

import static java.lang.Character.isLetter;

public class lengthOfLastWord_bruteForce {

  public static void main(String[] args) {
    String s = "j";

    // get the length of string
    int length = s.length();

    // initialize a 'length' variable for the length of last word
    int lastLen = 0;

//    if (length == 1) { // if there is only one letter/char in the string
//      if (Character.isLetter(s.charAt(0))) {
//        lastLen = 1;
//      }
//    } else
    if (s.isEmpty() || length > 10000) {
      lastLen = 0;
    } else {
      for (int i = length - 1; i >= 0; i--) {
        // when the character is a letter, increment 'lastLen'
        if (s.charAt(i) != ' ') {
          lastLen++;
        }

        // when 'lastLen' is not 0 (indicating it has been incremented and therefore, a word has been processed) and
        // the char in the index is a space (indicating that the index before this is the first character
        // of the last word), we break out of the loop.
        if (lastLen != 0 && (s.charAt(i) == ' ')) {
          break;
        }
      }
    }

    System.out.println(lastLen);
  }
}
