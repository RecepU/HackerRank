package com.java.introduction;

    /*
    Java Int to String
    https://www.hackerrank.com/challenges/java-int-to-string/problem
     */

    /*
    You are given an integer , you have to convert it into a string.

    Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

     can range between  to  inclusive.

    Sample Input 0

    100
    Sample Output 0

    Good job
     */

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String s = Integer.toString(n);

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong anser");
        }
    }


}
