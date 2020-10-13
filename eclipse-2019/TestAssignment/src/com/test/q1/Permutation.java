package com.test.q1;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/** Java program to print all permutations of a The Class Permutation. */
public class Permutation {

    static {
        init();
    }

    /** The Constant LOGGER. */

    private static final Logger LOGGER = Logger.getLogger(Permutation.class);

    /** init method. */
    private static void init() {
        DOMConfigurator.configure("log4j.xml");
    }

    /** The main method.
     *
     * @param args
     *            the arguments */
    public static void main(String[] args) {
        String str = "MNO";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n - 1);
    }

    /** permutation function.
     * 
     * @param str
     *            string to calculate permutation for.
     * @param l
     *            starting index
     * @param r
     *            end index */
    private void permute(String str, int l, int r) {
        if (l == r)
            LOGGER.info(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    /** Swap Characters at position.
     * 
     * @param a
     *            string value
     * @param i
     *            position 1
     * @param j
     *            position 2
     * @return swapped string */
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}