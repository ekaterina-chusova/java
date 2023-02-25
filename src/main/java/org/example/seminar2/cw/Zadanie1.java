package org.example.seminar2.cw;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        int n;
        x = sc.nextDouble();
        n = sc.nextInt();
        double result = 1;
        sc.close();
        if (n<0){
            x = 1/x;
            n *= -1;
        }
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println("result = " + result);
    }

}
