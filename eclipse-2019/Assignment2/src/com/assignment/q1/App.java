package com.assignment.q1;
import java.util.ArrayList;
import java.util.logging.Logger;


public class App {

    private static final Logger LOGGER = Logger.getLogger("App.class");

    /** main.
     * 
     * @param args
     *            [] */
    public static void main(String[] args) {

        
        String[] strArr1 = { "abcd", "fjkr", "vpfj" };
        ArrayList<Character> chlist = new ArrayList<Character>();
        chlist.add('b');
        chlist.add('f');
        chlist.add('j');
        chlist.add('p');
        chlist.add('v');

        String[] strArr2 = { "abcd", "fjkr", "vpfj" };
        ArrayList<Character> chlist2 = new ArrayList<Character>();
        chlist2.add('a');
        chlist2.add('a');
        chlist2.add('a');
        chlist2.add('a');
        chlist2.add('a');

        StringArrayLogic salObject = new StringArrayLogic();
        String output1 = salObject.validSqaure(strArr1, chlist);

        String output2 = salObject.validSqaure(strArr2, chlist2);

        ArrayList<Character> chlist3 = new ArrayList<Character>();
        String output3 = salObject.validSqaure(null, chlist3);
        LOGGER.info(output1);
        LOGGER.info(output2);
        LOGGER.info(output3);

            }
}
