package com.presentation1;

import java.util.logging.Logger;

/** The Class Mozzarella. */
public class Mozzarella extends ToppingDecorator {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(Mozzarella.class.getName());

    /** Instantiates a new mozzarella.
     *
     * @param newPizza
     *            the new pizza */
    public Mozzarella(Pizza newPizza) {

        super(newPizza);

        LOGGER.info("Adding Dough");

        LOGGER.info("Adding Moz");
    }

    /** Gets the description.
     *
     * @return the description */
    public String getDescription() {

        return tempPizza.getDescription() + ", mozzarella";

    }

    /** Gets the cost.
     *
     * @return the cost */
    public double getCost() {

        LOGGER.info("Cost of Moz: " + 15.50);

        return tempPizza.getCost() + 15.50;

    }

}