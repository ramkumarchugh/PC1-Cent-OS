package com.Decorator;

import java.util.logging.Logger;

/** The Class RedShapeDecorator. */
public class RedShapeDecorator extends ShapeDecorator {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(DecoratorPatternDemo.class.getName());

    /** Instantiates a new red shape decorator.
     *
     * @param decoratedShape
     *            the decorated shape */
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    /** Draw. */
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    /** Sets the red border.
     *
     * @param decoratedShape
     *            the new red border */
    private void setRedBorder(Shape decoratedShape) {
        LOGGER.info("Border Color: Red");
    }
}