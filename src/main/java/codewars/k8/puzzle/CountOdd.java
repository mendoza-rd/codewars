package codewars.k8.puzzle;

/**
 * Count Odd Numbers below n
 * Given a number n, return the number of positive odd numbers below n, EASY! *
 * oddCount(7) //=> 3, i.e [1, 3, 5]
 * oddCount(15) //=> 7, i.e [1, 3, 5, 7, 9, 11, 13] *
 * Expect large Inputs!
 */

public class CountOdd {
    public static int oddCount(int n){
        return n / 2;
    }
}
