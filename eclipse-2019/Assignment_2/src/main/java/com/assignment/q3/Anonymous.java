package com.assignment.q3;

import java.util.logging.Logger;

import com.assignment.q2.Reflection;

/** @author impetus */
interface Calculate {
    Logger LOGGER = Logger.getLogger(Reflection.class.getName());

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
            public void square(int a) {

                LOGGER.info("Square of number is " + a * a);
            }
        };
        oj1.square(a);
    }
}