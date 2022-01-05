package com.java.strings;

    /*
    Java String Reverse
    https://www.hackerrank.com/challenges/java-string-reverse/problem
     */

    /*
    A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

    Given a string , print Yes if it is a palindrome, print No otherwise.

    Constraints

     will consist at most  lower case english letters.
    Sample Input

    madam
    Sample Output

    Yes
     */

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lenght = A.length();
        boolean palindrome = true;

        if (lenght % 2 == 0) {
            for (int i = 0; i < lenght / 2; i++) {
                if (!(A.substring(i, i + 1).equals(A.substring(lenght - (i + 1), lenght - i)))) {
                    palindrome = false;
                    break;
                }
            }
        } else {
            for (int i = 0; i < (lenght - 1) / 2; i++) {
                if (!(A.substring(i, i + 1).equals(A.substring(lenght - (i + 1), lenght - i)))) {
                    palindrome = false;
                    break;
                }
            }
        }
        if (palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
