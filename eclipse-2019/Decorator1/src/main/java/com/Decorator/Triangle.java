package com.Decorator;

import java.util.logging.Logger;

/** The Class Triangle. */
public class Triangle implements Shape {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(DecoratorPatternDemo.class.getName());

    /** Draw. */
    public void draw() {
        LOGGER.info("Shape:Triangle");

    }

}
