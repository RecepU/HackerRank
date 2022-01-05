package com.java.dataStructures;

    /*
    Java Arraylist
    https://www.hackerrank.com/challenges/java-arraylist/problem
     */

    /*
    Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

    You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

    Take your input from System.in.

    Input Format
    The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

    Constraints

    Each number will fit in signed integer.
    Total number of integers in  lines will not cross .

    Output Format
    In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

    Sample Input

    5
    5 41 77 74 22 44
    1 12
    4 37 34 36 52
    0
    3 20 22 33
    5
    1 3
    3 4
    3 1
    4 3
    5 5
    Sample Output

    74
    52
    37
    ERROR!
    ERROR!
    Explanation

    The diagram below explains the queries:

    image
     */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        List<List<Integer>> numbers = new ArrayList<>();
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int d = input.nextInt();
            List<Integer> nums = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                nums.add(input.nextInt());
            }
            numbers.add(nums);
        }

        int q = input.nextInt();
        int[] x = new int[q];
        int[] y = new int[q];
        for (int i = 0; i < q; i++) {
            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }
        input.close();

        for (int i = 0; i < q; i++) {
            if (x[i] < numbers.size() && y[i] <= numbers.get(x[i] - 1).size()) {
                System.out.println(numbers.get(x[i] - 1).get(y[i] - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

    }
}
