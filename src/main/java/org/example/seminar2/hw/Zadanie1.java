/*
Дана последовательность N целых чисел.
Найти сумму простых чисел.
 */
package org.example.seminar2.hw;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("Numbers: :");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += prime(num);
        }
        scanner.close();
        System.out.println("SumPrime = " + sum);
    }
    public static  int prime(int number){
        boolean isPrime = true;
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            return number;
        }
        else {
            return 0;
        }
    }
}
