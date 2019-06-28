package com.Decorator;

import java.util.logging.Logger;

/** The Class Circle. */
public class Circle implements Shape {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(DecoratorPatternDemo.class.getName());

    /** Draw. */
    public void draw() {
        LOGGER.info("Shape:Circle");

    }

}
