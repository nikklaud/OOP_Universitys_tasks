public class Fruit extends APlant {
    public Fruit(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("You eat the fruit: " + getName());
    }

    @Override
    public void prepare() {
        System.out.println("Peeling the " + getName());
    }
}
