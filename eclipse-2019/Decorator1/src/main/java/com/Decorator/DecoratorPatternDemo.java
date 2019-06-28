package com.Decorator;

import java.util.logging.Logger;

/** The Class DecoratorPatternDemo. */
public class DecoratorPatternDemo {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(DecoratorPatternDemo.class.getName());

    /** The main method.
     *
     * @param args
     *            the arguments */
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape redtriangle = new RedShapeDecorator(new Triangle());

        LOGGER.info("Circle with normal border");
        circle.draw();
        rectangle.draw();
        triangle.draw();

        LOGGER.info("\nCircle of red border");
        redCircle.draw();

        LOGGER.info("\nRectangle of red border");
        redRectangle.draw();

        LOGGER.info("\nTriangle of red border");
        redtriangle.draw();
    }
}