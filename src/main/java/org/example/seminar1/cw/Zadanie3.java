/*
Дана строка. Поменять местами ее половины.
 */

package org.example.seminar1.cw;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringBuilder myNewStr = new StringBuilder();
        myNewStr.append(str.substring(str.length()/2, str.length()))
                .append(str.substring(0, str.length() / 2));
        System.out.println(myNewStr.toString());
    }
}
