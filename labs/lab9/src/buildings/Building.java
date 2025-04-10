package buildings;

public abstract class Building {
    private String address;
    private int yearBuilt;

    public Building(String address, int yearBuilt) {
        this.address = address;
        this.yearBuilt = yearBuilt;
    }

    public String getAddress() {
        return address;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public abstract double calculateTax();

    @Override
    public String toString() {
        return "address='" + address + "', yearBuilt=" + yearBuilt;
    }
}
