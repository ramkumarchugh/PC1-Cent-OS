package com.Decorator;

/** The Class ShapeDecorator. */
public abstract class ShapeDecorator implements Shape {

    /** The decorated shape. */
    protected Shape decoratedShape;

    /** Instantiates a new shape decorator.
     *
     * @param decoratedShape
     *            the decorated shape */
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    /** Draw. */
    public void draw() {
        decoratedShape.draw();
    }
}