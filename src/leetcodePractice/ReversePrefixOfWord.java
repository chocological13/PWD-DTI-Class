package src.leetcodePractice;

public class ReversePrefixOfWord {

  public static void main(String[] args) {
    String word = "abcdefgh";
    char ch = 'd';

    System.out.println(reversePrefixOfWord(word, ch));
  }

  public static String reversePrefixOfWord(String word, char ch) {
    // initiate an index to store info on where char ch is
    // initialize at -1 bc if we found a match the first index is 0
    int index = -1;

    // find out where char ch is at in the string
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == ch) {
        index = i;
        break;
      }
    }

    // check if index is found
    if (index != -1) {
      // char array to manipulate
      char[] chNew = word.toCharArray();

      // index will be how many times we rotate
      // reverse the prefix by swapping characters
      // index/2 because we only need to swap half the time
      // <= so we also do the one in the middle
      for (int i = 0; i <= index/2; i++) {
        char temp = chNew[i];
        chNew[i] = chNew[index - i];
        chNew[index - i] = temp;
      }
      word = String.valueOf(chNew);
    }

    return word; // it will return unchanged if no ch is found in the string
  }
}
