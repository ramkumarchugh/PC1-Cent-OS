package com.presentation1;

import java.util.logging.Logger;

/** The Class PlainPizza. */
public class PlainPizza implements Pizza {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(PizzaMaker.class.getName());

    /** Gets the description.
     *
     * @return the description */
    public String getDescription() {

        return "Thin dough";

    }

    /** Gets the cost.
     *
     * @return the cost */
    public double getCost() {

        LOGGER.info("Cost of Dough: " + 40.00);

        return 40.00;

    }

}