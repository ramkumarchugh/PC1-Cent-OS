package com.test.q2;

/** The Class Truck. */
public class Truck extends Vehicle {

    /** The cargo weight limit. */
    private long cargoWeightLimit;

    /** Instantiates a new truck.
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
     * @param cargoWeightLimit
     *            the cargo weight limit */
    public Truck(String vehicleModel, String registrationNumber, float vehicleSpeed, int fuelCapacity, float fuelConsumption, long cargoWeightLimit) {
        super(vehicleModel, registrationNumber, vehicleSpeed, fuelCapacity, fuelConsumption);
        this.cargoWeightLimit = cargoWeightLimit;
    }

    /** Gets the cargo weight limit.
     *
     * @return the cargo weight limit */
    public long getCargoWeightLimit() {
        return cargoWeightLimit;
    }

    /** Sets the cargo weight limit.
     *
     * @param cargoWeightLimit
     *            the new cargo weight limit */
    public void setCargoWeightLimit(long cargoWeightLimit) {
        this.cargoWeightLimit = cargoWeightLimit;
    }

    /** Display. */
    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
    }

}
