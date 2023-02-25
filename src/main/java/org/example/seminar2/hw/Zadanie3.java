/*
Дан массив целых чисел.
Заменить отрицательные элементы на
сумму индексов двузначных элементов массива.
 */
package org.example.seminar2.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        int n = scanner.nextInt();
        System.out.println("Numbers: :");
        int [] mass = new int[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }

        for (int i = 0; i < mass.length; i++) {
            if (Math.abs(mass[i]) > 9 && Math.abs(mass[i]) < 100){
                sum += i;
            }
        }

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0){
                mass[i] = sum;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
