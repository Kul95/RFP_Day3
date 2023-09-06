package com.Practice.LineComparisionProblem;

public class LineCpmarisionLatest {

    public static void main(String[] args) {
        System.out.println("Welcome to line computation.");

        //  length1..
        double length1 = lengthMethod(5, 30, 4, 20);
        String str1 = String.valueOf(length1);
//        System.out.println(str1);

        //  length2..
        double length2 = lengthMethod(1, 50, 4, 40);
        String str2 = String.valueOf(length2);
//        System.out.println(str2);

        // equals method
        System.out.print("Equals method: " + str1.equals(str2));
        System.out.println();

        //compareTo method
        System.out.print("CompareTo method: " + str1.compareTo(str2));
        System.out.println();
    }

    public static double lengthMethod(int x1, int x2, int y1, int y2) {
        double length3 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println(length3);
        return length3;
    }
}



