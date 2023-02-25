package org.example.seminar2.cw;

public class Zadanie4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 1,1);
        Vector vector2 = new Vector(1, 1,1);

        System.out.println(vector1.toString());
        System.out.println("length = " + vector1.length());
        System.out.println("scal = " + vector1.scal(vector2));
        System.out.println("vecPr = " + vector1.vecPr(vector2));
        System.out.println("cosinus = " + vector1.cos(vector2));
        System.out.println("sumVect = " + vector1.sumVect(vector2));
        System.out.println("difVect = " + vector1.difVect(vector2));
    }
}
