package com.java.advanced;

    /*
    Prime Checker
    https://www.hackerrank.com/challenges/prime-checker/problem
     */

    /*
    You are given a class Solution and its main method in the editor. Your task is to create a class Prime. The class Prime should contain a single method checkPrime.

    The locked code in the editor will call the checkPrime method with one or more integer arguments. You should write the checkPrime method in such a way that the code prints only the prime numbers.

    Please read the code given in the editor carefully. Also please do not use method overloading!

    Note: You may get a compile time error in this problem due to the statement below:

      BufferedReader br=new BufferedReader(new InputStreamReader(in));
    This was added intentionally, and you have to figure out a way to get rid of the error.

    Input Format

    There are only five lines of input, each containing one integer.

    Output Format

    There will be only four lines of output. Each line contains only prime numbers depending upon the parameters passed to checkPrime in the main method of the class Solution. In case there is no prime number, then a blank line should be printed.

    Sample Input

    2
    1
    3
    4
    5
    Sample Output

    2
    2
    2 3
    2 3 5
     */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

import static java.lang.System.in;

class Prime {

    public void checkPrime(int... num) {
        for (int i = 0; i < num.length; i++) {
            boolean flag = true;
            if (num[i] == 1) {
                continue;
            }
            if (num[i] == 2) {
                System.out.print(num[i] + " ");
                continue;
            }
            int n = num[i] - 1;
            while (n > 1) {
                if (num[i] % n == 0) {
                    flag = false;
                }
                n--;
            }
            if (flag) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
    }

}

public class PrimeChecker {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
