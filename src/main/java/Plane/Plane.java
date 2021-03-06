package Plane;

public class Plane {

    private PlaneType planeType;

    public Plane (PlaneType planeType) {
        this.planeType = planeType;


    }


    public int getCapacityOfPlane() {
        return this.planeType.getCapacity();
    }

    public double getTotalWeight() {
        return this.planeType.getTotalWeight();
    }
    public double getWeightReservedForBaggage() {
        return (this.getTotalWeight()/2);
    }
}
