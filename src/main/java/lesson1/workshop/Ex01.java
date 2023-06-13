package lesson1.workshop;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(subtractProductAndSum(n));
    }

    /**
     * @param n Input number
     * @return Result
     * @apiNote Given an integer number n, return the difference between the product of its digits and the sum of its digits.
     */
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            sum += n % 10;
            product *= n % 10;
            n = n / 10;
        }
        return product - sum;
    }

}


