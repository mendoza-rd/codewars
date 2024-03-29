package codewars.k8.mathematics;

/**
 * Convert to Binary
 * Given a non-negative integer n, write a function toBinary/ToBinary
 * which returns that number in a binary format. *
 * to_binary(1)   should return 1
 * to_binary(5)   should return 101
 * to_binary(11)  should return 1011
 */

public class ConvertBinary {

    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}
