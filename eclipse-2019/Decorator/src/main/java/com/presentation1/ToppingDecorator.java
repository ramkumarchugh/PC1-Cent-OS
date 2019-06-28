package com.presentation1;

/** The Class ToppingDecorator. */
abstract class ToppingDecorator implements Pizza {

    /** The temp pizza. */
    protected Pizza tempPizza;

    /** Instantiates a new topping decorator.
     *
     * @param newPizza
     *            the new pizza */
    public ToppingDecorator(Pizza newPizza) {

        tempPizza = newPizza;

    }

    /** Gets the description.
     *
     * @return the description */
    public String getDescription() {

        return tempPizza.getDescription();

    }

    /** Gets the cost.
     *
     * @return the cost */
    public double getCost() {

        return tempPizza.getCost();

    }

}