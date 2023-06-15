package lesson1.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @apiNote Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters.
 * The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words. Do not include any extra spaces.
 */
public class Ex01Hw {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        System.out.println(replacingWordOrder(inputString));
    }

    /**
     * @param s input string to reverse
     * @return reversed string
     */
    static String replacingWordOrder(String s) {
        String[] separatedString = s.trim().split("\\s+");
        System.out.println(Arrays.toString(separatedString));
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = separatedString.length - 1; i >= 0; i--) {
            joiner.add(separatedString[i]);
        }
        return joiner.toString();
    }
}
