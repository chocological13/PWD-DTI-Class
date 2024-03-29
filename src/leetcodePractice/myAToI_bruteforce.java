package src.leetcodePractice;

import static java.lang.Character.isDigit;

import java.util.ArrayList;

public class myAToI_bruteforce {

  public static void main(String[] args) {
    String num = "9223372036854775808";

    int numInt = myAtoI(num);
    System.out.println(numInt);
  }
  public static int charValue(char c) {
    if (Character.isDigit(c)) {
      return c - '0'; // convert to digit with ASCII
    } else {
      return 0;
    }
  }

  public static int myAtoI(String s) {
    if (s.length() > 200) {
      // length constraint
      return 0;
    }

    char[] sChar = s.trim().toCharArray();
    int n = sChar.length;

    // initialize a sign to detect whether an int is neg or pos
    int sign = 1; // pos
    int i = 0;

    // check for sign before the string ends
    if (i < n && (sChar[i] == '-' || sChar[i] == '+')) {
      sign = (sChar[i] == '-' ? -1 : 1);
      i++;
    }

    // while loop to check if character is digit and stop if it isn't
    long atoi = 0;
    while (i < n && Character.isDigit(sChar[i])) {

      // convert char into int and add to the position
      int digit = charValue(sChar[i]);
      atoi = atoi * 10 + digit;

      // check if there's overflow after assigning sign
      if (atoi * sign > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      } else if (atoi * sign < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
      i++;
    }

    return (int) atoi * sign;
  }
}
