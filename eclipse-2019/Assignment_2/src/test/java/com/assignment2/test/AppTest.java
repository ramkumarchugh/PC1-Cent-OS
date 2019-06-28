package com.assignment2.test;

import java.util.ArrayList;

import com.assignment.q1.StringArray;

import junit.framework.TestCase;


/** The Class AppTest. */
public class AppTest extends TestCase {

    /** Sample string test. */
    public void testValidSqaure1() {
        StringArray testSquare = new StringArray();
        String[] inputString = { "abcd", "fjkr", "vpfj" };
        ArrayList<Character> searchString = new ArrayList<Character>();

        searchString.add('b');
        searchString.add('f');
        searchString.add('j');
        searchString.add('p');
        searchString.add('v');

        String result = testSquare.validSqaure(inputString, searchString);

        assertEquals("1-0", result);

    }

    /** Test valid sqaure 2. 
     * one is the input string and other one is the searching string*/
    public void testValidSqaure2() {
        StringArray testSquare = new StringArray();
        String[] inputString = { "abcd", "fjkr", "vpfj" };
        ArrayList<Character> searchString = new ArrayList<Character>();

        searchString.add('f');
        searchString.add('j');
        searchString.add('p');
        searchString.add('k');

        String result = testSquare.validSqaure(inputString, searchString);

        assertEquals("1-1", result);

    }

    /** Test valid sqaure 3. */
    public void testValidSqaure3() {
        StringArray testSquare = new StringArray();
        String[] inputString = { "abcd", "fjkr", "vpfj" };
        ArrayList<Character> searchString = new ArrayList<Character>();

        searchString.add('b');
        searchString.add('a');
        searchString.add('j');
        searchString.add('p');
        searchString.add('l');

        String result = testSquare.validSqaure(inputString, searchString);

        assertEquals("Not Found", result);

    }

}