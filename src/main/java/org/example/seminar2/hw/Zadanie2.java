/*
Дана последовательность из N целых чисел.
Верно ли, что последовательность является возрастающей.
 */
package org.example.seminar2.hw;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        int n = scanner.nextInt();
        System.out.println("Numbers: :");
        int num1 = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num1 < num2) {
                num1 = num2;
            } else {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}