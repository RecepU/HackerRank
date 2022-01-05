package com.java.strings;

    /*
    Java Regex
    https://www.hackerrank.com/challenges/java-regex/problem
     */

    /*
    Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:

    IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
    Some valid IP address:

    000.12.12.034
    121.234.12.12
    23.45.12.56
    Some invalid IP address:

    000.12.234.23.23
    666.666.23.23
    .213.123.23.32
    23.45.22.32.
    I.Am.not.an.ip
    In this problem you will be provided strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.

    Just write the MyRegex class which contains a String . The string should contain the correct regular expression.

    (MyRegex class MUST NOT be public)

    Sample Input

    000.12.12.034
    121.234.12.12
    23.45.12.56
    00.12.123.123123.123
    122.23
    Hello.IP
    Sample Output

    true
    true
    true
    false
    false
    false
     */

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    static String pattern = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])[.]" +
            "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])[.]" +
            "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])[.]" +
            "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    /*
    for 0-255;
    explaining the regex of (\d{1,2}|(0|1)\d{2}|2[0-4]\d|25[0-5])
    There are 3 options;

    1.
    \d{1,2}
    it can be 1 or 2 digit(ex: 1, 11, 3, 33, ...)

    2.
    (0|1)\d{2}
    if first digit 0 or 1, others doesn't matter(ex: 199, 099, 123, 076, ...)

    3.
    2[0-4]\d|25[0-5]
    if first digit 2; second digit can be between [0-4] and third digit doesn't matter(ex: 209, 218, 227, 235, 249, ...)
                      or second digit can be 5 and third digit must be between [0-5] (ex: 250, 251, 252, 253, 254, 255).
     */

    //More info;
    //https://regex101.com/r/Tbgqjd/1
}
