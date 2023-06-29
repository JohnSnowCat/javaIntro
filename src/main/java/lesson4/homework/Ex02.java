package lesson4.homework;

import java.util.Deque;
import java.util.LinkedList;

public class Ex02 {

    public static void main(String[] args) {
        System.out.println(isValid("{(()[])}"));
    }

    public static boolean isValid(String s) {
        Deque<Character> input = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                input.addFirst(c);
            } else if (input.isEmpty() || !match(input.pop(), c)) {
                return false;
            }
        }
        return input.isEmpty();
    }

    private static boolean match(char l, char r) {
        return (l == '(' && r == ')') || (l == '{' && r == '}') || (l == '[' && r == ']');
    }
}
