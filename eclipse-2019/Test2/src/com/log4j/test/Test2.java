package com.log4j.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/** Test2 is a class. */
public class Test2 {

    static {
        init();
    }

    private static final Logger LOGGER = Logger.getLogger(Test2.class);

    /** init method. */
    private static void init() {
        DOMConfigurator.configure("log4j.xml");
    }

    /** main method.
     * 
     * @param args
     *            [] */
    public static void main(String[] args) {
        LOGGER.info("Hello");
    }

 
}

/*
 * Help> MarketPlace > search 1. Checkstyle 2. Sonar lint Install anyways success 1. Add impetus checkstyle. Windows > preferences > CHeckstyle > add
 * new (external) 2. Apply it to project. Right CLick on project > Checkstyle > activate/Check code. Apply Formatter Window > preferences > JAVA >
 * formatter > import file and apply and close.
 */
