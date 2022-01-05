package com.java.dataStructures;

    /*
    Java 2D Array
    https://www.hackerrank.com/challenges/java-2d-array/problem
     */

    /*
    You are given a  2D array. An hourglass in an array is a portion shaped like this:

    a b c
      d
    e f g
    For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

    1 1 1     1 1 0     1 0 0
      1         0         0
    1 1 1     1 1 0     1 0 0
    The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

    In this problem you have to print the largest sum among all the hourglasses in the array.

    Input Format

    There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.

    Output Format

    Print the answer to this problem on a single line.

    Sample Input

    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 2 4 4 0
    0 0 0 2 0 0
    0 0 1 2 4 0
    Sample Output

    19
    Explanation

    The hourglass which has the largest sum is:

    2 4 4
      2
    1 2 4
     */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int r1 = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                int r2 = arr.get(i + 1).get(j + 1);
                int r3 = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                int total = r1 + r2 + r3;
                if (total > sum) {
                    sum = total;
                }
            }
        }
        System.out.println(sum);

        bufferedReader.close();
    }
}
