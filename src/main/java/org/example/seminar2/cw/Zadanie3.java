package org.example.seminar2.cw;

import java.util.Scanner;
import java.util.Vector;

/*
3) Дан массив целых чисел.
Найти количество пар соседних элементов,
где первый элемент вдвое больше второго.
 */
public class Zadanie3 {
    public static void main(String[] args) {
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("N: ");
        int n = scanner.nextInt();
        System.out.println("mass: ");
        int [] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }

        for (int i = 0; i < n-1 ; i++) {
            if (mass[i] == 2*mass[i+1]){
                k++;
            }
        }
        scanner.close();
        System.out.println("k = " + k);
    }
}
