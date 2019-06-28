package com.log4j.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Test class.
 * @author impetus
 *
 */
public class Test {
    static {
        init();
    }

    private static final Logger LOGGER = Logger.getLogger(Test2.class);

    /** init method. */
    private static void init() {
        DOMConfigurator.configure("log4j.xml");
    }
    /** Main method.
     * 
     * @param args []
     */
    public static void main(String args[]) {
    LOGGER.info("Hello");    
    LOGGER.debug("Hello");    
        
    }

}
