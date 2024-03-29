package src.leetcodePractice;

public class lengthOfLastWord_optimized {

  public static void main(String[] args) {
    String s = "Hello world!";

    // * remove all non-letter chars
    s = s.replaceAll("[^a-zA-Z]+$", "");

    // * split character by space
    String[] words = s.split(" ");

    // * get the last word from the array
    String lastWord = words[words.length - 1];

    // * get the length of last word
    int length = lastWord.length();

    System.out.println(length);
  }
}
