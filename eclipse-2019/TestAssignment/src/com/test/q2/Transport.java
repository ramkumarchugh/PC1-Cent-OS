package com.test.q2;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.test.q3.BubbleSort;

/** Transport Class with main method.
 *
 * @author impetus */
public class Transport {
    static {
        init();
    }

    /** The Constant LOGGER. */
    
    private static final Logger LOGGER = Logger.getLogger(BubbleSort.class);

    /** init method. */
    private static void init() {
        DOMConfigurator.configure("log4j.xml");
    }

    /** The main method.
     *
     * @param args
     *            the arguments */
    public static void main(String[] args) {
        final int x = 25;
        final int y = 60;
        final float z = 12.5f;
        final long a = 265480;
        final int b = 40;
        final int c = 55;
        final int d = 10;
        final int e = 56;
        final int f = 500;
        final int g = 600;
        final int h = 60;

        Truck t1 = new Truck("2008", "MP09AB3252", x, y, z, a);
        Bus b1 = new Bus("2010", "MP09XA5685", b, c, d, e);
        LOGGER.info("Fuel needed in litre of truck " + t1.fuelNeeded(f));
        LOGGER.info("Fuel needed in litre of truck " + t1.distanceCovered(c));
        t1.display();

        LOGGER.info("Fuel needed in litre of Bus " + b1.fuelNeeded(g));
        LOGGER.info("Fuel needed in litre of Bus " + b1.distanceCovered(h));
        b1.display();

    }
}
