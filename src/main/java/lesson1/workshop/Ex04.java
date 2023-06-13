package lesson1.workshop;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println(addBinary(first, second));
    }

    /**
     * @param a первая строка
     * @param b вторая строка
     * @return двоичная сумма двух строк
     * @apiNote https://leetcode.com/problems/add-binary/
     */
    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            addBinary(b, a);
        }
        int k = 0;
        int j = b.length() - 1;
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                k++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                k++;
            }
            j--;
            result = k % 2 + result;
            k /= 2;
        }
        if (k == 1) {
            result = k % 2 + result;
        }
        return result;
    }
}
