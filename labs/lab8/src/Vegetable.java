public class Vegetable extends APlant {
    public Vegetable(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("You eat the vegetable: " + getName());
    }

    @Override
    public void prepare() {
        System.out.println("Chopping the " + getName());
    }
}
