package buildings;

import habitable.Habitable;

public class House extends Building implements Habitable, Comparable<House> {
    private int livingArea;
    private int numberOfRooms;
    private boolean hasGarage;

    public House(String address, int yearBuilt, int livingArea, int numberOfRooms, boolean hasGarage) {
        super(address, yearBuilt);
        this.livingArea = livingArea;
        this.numberOfRooms = numberOfRooms;
        this.hasGarage = hasGarage;
    }

    @Override
    public int getLivingArea() {
        return livingArea;
    }

    @Override
    public boolean isSuitableForLiving() {
        return getYearBuilt() > 1900 && numberOfRooms > 0;
    }

    @Override
    public double calculateTax() {
        return livingArea * 50;
    }

    @Override
    public int compareTo(House other) {
        return Integer.compare(this.livingArea, other.livingArea);
    }

    @Override
    public String toString() {
        return "House{" + "address='" + getAddress() + "', yearBuilt=" + getYearBuilt() +
                ", livingArea=" + livingArea + ", rooms=" + numberOfRooms +
                ", garage=" + hasGarage + '}';
    }
}
