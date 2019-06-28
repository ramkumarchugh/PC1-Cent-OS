package com.assignment.q1;

import java.util.ArrayList;
import java.util.logging.Logger;

/** Hello world!. */
public class App {

    /** The Constant LOGGER. */
    public static final Logger LOGGER = Logger.getLogger(App.class.getName());

    /** The main method.
     *
     * @param args
     *            the arguments */
    public static void main(String[] args) {
        StringArray testSquare = new StringArray();
        String[] inputString = { "abcd", "fjkr", "vpfj" };
        ArrayList<Character> searchString = new ArrayList<Character>();

        searchString.add('b');
        searchString.add('f');
        searchString.add('j');
        searchString.add('p');
        searchString.add('v');

        String result = testSquare.validSqaure(inputString, searchString);
        LOGGER.info(result);

    }
}
