package src.leetcodePractice;

class Solution {
    public int reverse(int x) {
        // initialize a 'reversed' variable to store the output
        // we will use a 'long' so that we can check for overflow later
        long reversed = 0;

        while (x != 0) {
            int digit = x % 10; // get the last digit of temp

            // assign the digit at the reversed position
            reversed = reversed * 10 + digit;

            // check for overflow with this
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }

            x /= 10; // discard the last digit to move on to next iteration
        }
        return (int)reversed;
    }
}