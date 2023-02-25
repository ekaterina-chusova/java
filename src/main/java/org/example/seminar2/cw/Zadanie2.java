/*
Дана последовательность из N целых чисел.
Найти сумму чисел, оканчивающихся на 5,
перед которыми идет четное число.
 */

package org.example.seminar2.cw;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N");
        int n = scanner.nextInt();
        System.out.println("numbers:");
        int num1 = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num1 % 2 == 0 && num2 % 10 == 5){
                sum += num2;
            }
            num1 = num2;
        }
        scanner.close();
        System.out.println(sum);
    }
}
