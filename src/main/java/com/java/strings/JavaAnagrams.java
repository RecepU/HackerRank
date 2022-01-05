package com.java.strings;

    /*
    Java Anagrams
    https://www.hackerrank.com/challenges/java-anagrams/problem
     */

    /*
    Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

    Function Description

    Complete the isAnagram function in the editor.

    isAnagram has the following parameters:

    string a: the first string
    string b: the second string
    Returns

    boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
    Input Format

    The first line contains a string .
    The second line contains a string .

    Constraints

    Strings  and  consist of English alphabetic characters.
    The comparison should NOT be case sensitive.
    Sample Input 0

    anagram
    margana
    Sample Output 0

    Anagrams
    Explanation 0

    Character	Frequency: anagram	Frequency: margana
    A or a	3	3
    G or g	1	1
    N or n	1	1
    M or m	1	1
    R or r	1	1
    The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

    Sample Input 1

    anagramm
    marganaa
    Sample Output 1

    Not Anagrams
    Explanation 1

    Character	Frequency: anagramm	Frequency: marganaa
    A or a	3	4
    G or g	1	1
    N or n	1	1
    M or m	2	1
    R or r	1	1
    The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

    Sample Input 2

    Hello
    hello
    Sample Output 2

    Anagrams
    Explanation 2

    Character	Frequency: Hello	Frequency: hello
    E or e	1	1
    H or h	1	1
    L or l	2	2
    O or o	1	1
    The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
     */


import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean ret = true;
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            ret = false;
        } else {
//            char [] aa = a.toCharArray();
//            char [] bb = b.toCharArray();
//            Arrays.sort(aa);
//            Arrays.sort(bb);
//            a=new String(aa);
//            b=new String(bb);
            //HackerRank doesn't allow to use Array.sort() method, we can not import Array class so i doesn't work.
            //Therefore, I try to solve different way even though above solution iss easier.

            char[] aa = new char[a.length()];
            char[] bb = new char[b.length()];


            for (int i = 0; i < a.length(); i++) {
                aa[i] = a.charAt(i);
                for (int j = i; j < a.length(); j++) {
                    if (aa[i] >= a.charAt(j)) {
                        aa[i] = a.charAt(j);
                        a = swap(a, i, j);
                    }
                }
            }
            System.out.println(Arrays.toString(aa));
            for (int i = 0; i < b.length(); i++) {
                bb[i] = b.charAt(i);
                for (int j = i; j < b.length(); j++) {
                    if (bb[i] > b.charAt(j)) {
                        bb[i] = b.charAt(j);
                        b = swap(b, i, j);
                    }
                }
            }
            System.out.println(Arrays.toString(bb));
            for (int i = 0; i < aa.length; i++) {
                if (!(aa[i] == (bb[i]))) {
                    ret = false;
                }
            }
        }
        return ret;
    }

    static String swap(String string, int i, int j) {
        char ch[] = string.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        string = new String(ch);
        return string;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
