package model;

public class Student {
    private String name;
    private String id;

    public Student(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "'}";
    }
}
