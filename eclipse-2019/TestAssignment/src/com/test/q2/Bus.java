package com.test.q2;

/** The Class Bus. */
public class Bus extends Vehicle {

    /** The no of passengers. */
    private int noOfPassengers;

    /** Instantiates a new bus.
     *
     * @param vehicleModel
     *            the vehicle model
     * @param registrationNumber
     *            the registration number
     * @param vehicleSpeed
     *            the vehicle speed
     * @param fuelCapacity
     *            the fuel capacity
     * @param fuelConsumption
     *            the fuel consumption
     * @param noOfPassengers
     *            the no of passengers */
    public Bus(String vehicleModel, String registrationNumber, float vehicleSpeed, int fuelCapacity, float fuelConsumption, int noOfPassengers) {
        super(vehicleModel, registrationNumber, vehicleSpeed, fuelCapacity, fuelConsumption);
        this.noOfPassengers = noOfPassengers;
    }

    /** Gets the no of passengers.
     *
     * @return the no of passengers */
    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    /** Sets the no of passengers.
     *
     * @param noOfPassengers
     *            the new no of passengers */
    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    /** Display. */
    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
    }

}
