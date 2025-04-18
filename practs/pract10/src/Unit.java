public abstract class Unit implements Actionable {
    protected String name;

    public Unit(String name) {
        this.name = name;
    }

    public void report() {
        System.out.println(name + " is ready for action!");
    }

    public abstract void attack();
    public abstract void defend();
}
