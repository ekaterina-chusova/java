package org.example.seminar1.hw;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        String newStr = "";
        for (int i = 0; i < words.length ; i++) {
            newStr = words[i] + " " + newStr;
        }
        System.out.println(newStr.trim());
    }
}
