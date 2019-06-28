package com.assignment.q3;

/** @author impetus */
interface Calculate {

    /** Square.
     *
     * @param y
     *            the y */
    void square(int y);
}

/** The Class Anonymous. */
class Anonymous {
    /** The main method.
     *
     * @param args
     *            the arguments */
    public static void main(String[] args) {
        final int a = 10;

        Calculate oj1 = new Calculate() {

            /** Square.
             *
             * @param a
             *            the a */
            @Override
            public void square(int a) {

                System.out.print("Square of number is " + a * a);
            }
        };
        oj1.square(a);
    }
}