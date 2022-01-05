package com.java.dataStructures;

    /*
    Java BitSet
    https://www.hackerrank.com/challenges/java-bitset/problem
     */

    /*
    Java's BitSet class implements a vector of bit values (i.e.:  () or  ()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of  is called a set bit.

    Given  BitSets,  and , of size  where all bits in both BitSets are initialized to , perform a series of  operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

    Input Format

    The first line contains  space-separated integers,  (the length of both BitSets  and ) and  (the number of operations to perform), respectively.
    The  subsequent lines each contain an operation in one of the following forms:

    AND
    OR
    XOR
    FLIP
    SET
    In the list above,  is the integer  or , where  denotes  and  denotes .
     is an integer denoting a bit's index in the BitSet corresponding to .

    For the binary operations , , and , operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:

    AND 2 1
     is the left operand, and  is the right operand. This operation should assign the result of  to .

    Constraints

    Output Format

    After each operation, print the respective number of set bits in BitSet  and BitSet  as  space-separated integers on a new line.

    Sample Input

    5 4
    AND 1 2
    SET 1 4
    FLIP 2 2
    OR 2 1
    Sample Output

    0 0
    1 0
    1 1
    1 2
    Explanation

    Initially: , , , and . At each step, we print the respective number of set bits in  and  as a pair of space-separated integers on a new line.



    ,
    The number of set bits in  and  is .


    Set  to  ().
    , .
    The number of set bits in  is  and  is .


    Flip  from  () to  ().
    , .
    The number of set bits in  is  and  is .


    .
    , .
    The number of set bits in  is  and  is .
     */

import java.util.*;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);
        BitSet[] bitSet = new BitSet[3];

        bitSet[1] = bitSet1;
        bitSet[2] = bitSet2;

        for (int i = 0; i < m; i++) {
            String operator = input.next();
            int n1 = input.nextInt();
            int n2 = input.nextInt();

            switch (operator) {
                case "AND":
                    bitSet[n1].and(bitSet[n2]);
                    break;
                case "OR":
                    bitSet[n1].or(bitSet[n2]);
                    break;
                case "XOR":
                    bitSet[n1].xor(bitSet[n2]);
                    break;
                case "FLIP":
                    bitSet[n1].flip(n2);
                    break;
                case "SET":
                    bitSet[n1].set(n2);
                    break;
            }
            System.out.printf("%d %d%n", bitSet1.cardinality(), bitSet2.cardinality());
        }
    }
}
