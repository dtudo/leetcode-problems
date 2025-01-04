package problems;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 */
public class P58LengthOfLastWord {
    private static final char DELIMITER = ' ';

    public int lengthOfLastWord(String s) {
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != DELIMITER) {
                counter++;
            }

            if (counter != 0 && s.charAt(i) == DELIMITER) {
                return counter;
            }
        }

        return counter;
    }
}