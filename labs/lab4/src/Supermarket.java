public class Supermarket {
    String name;
    String location;
    int employees;
    int area;
    int hours;

    public Supermarket() {
        this.name = "Unknown_supermarket";
        this.location = "Unknown_location";
        this.employees = 0;
        this.area = 0;
        this.hours = 0;
    }
    public Supermarket(String name, String location, int employees, int area, int hours) {
        this.name = name;
        this.location = location;
        this.employees = employees;
        this.area = area;
        this.hours = hours;
    }

    public void display() {
        System.out.printf("Name: %s, Location: %s, Employees: %d, Area: %d, Hours: %d", name, location, employees, area, hours);
    }
}
