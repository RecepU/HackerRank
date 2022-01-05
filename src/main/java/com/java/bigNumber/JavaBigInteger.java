package com.java.bigNumber;

    /*
    Java BigInteger
    https://www.hackerrank.com/challenges/java-biginteger/problem
     */

    /*
    In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

    Use the power of Java's BigInteger class and solve this problem.

    Input Format

    There will be two lines containing two numbers,  and .

    Constraints

     and  are non-negative integers and can have maximum  digits.

    Output Format

    Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.

    Sample Input

    1234
    20
    Sample Output

    1254
    24680
    Explanation




     */

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BigInteger bigInteger1 = input.nextBigInteger();
        BigInteger bigInteger2 = input.nextBigInteger();

        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));


    }
}
