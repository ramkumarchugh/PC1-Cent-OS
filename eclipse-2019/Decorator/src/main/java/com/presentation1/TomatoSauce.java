package com.presentation1;

import java.util.logging.Logger;

/** The Class TomatoSauce. */
public class TomatoSauce extends ToppingDecorator {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(PizzaMaker.class.getName());

    /** Instantiates a new tomato sauce.
     *
     * @param newPizza
     *            the new pizza */
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        LOGGER.info("Adding Sauce");
    }

    /** Gets the description.
     *
     * @return the description */
    public String getDescription() {

        return tempPizza.getDescription() + ", tomato sauce";

    }

    /** Gets the cost.
     *
     * @return the cost */
    public double getCost() {

        LOGGER.info("Cost of Sauce: " + 5.35);

        return tempPizza.getCost() + 5.35;

    }

}