package com.Decorator;

import java.util.logging.Logger;

/** The Class Rectangle. */
public class Rectangle implements Shape {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(Rectangle.class.getName());

    /** Draw. */
    public void draw() {
        LOGGER.info("Shape:Rectangle");
    }

}
