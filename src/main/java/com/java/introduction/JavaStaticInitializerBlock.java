package com.java.introduction;

    /*
    Java Static Initializer Block
    https://www.hackerrank.com/challenges/java-static-initializer-block/problem
     */

    /*
    Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

    It's time to test your knowledge of Static initialization blocks. You can read about it here.

    You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

    If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

    Input Format

    There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

    Constraints

    Output Format

    If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

    Sample input 1

    1
    3
    Sample output 1

    3
    Sample input 2

    -1
    2
    Sample output 2

    java.lang.Exception: Breadth and height must be positive
     */

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static int B, H;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(B * H);
        }


    }
}
