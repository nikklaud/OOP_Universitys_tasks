public abstract class APlant implements IEdible {
    private String name;

    public APlant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void describe() {
        System.out.println("This is a " + name);
    }

    @Override
    public void wash() {
        System.out.println(name + " is washed before eating.");
    }

    @Override
    public abstract void eat();

    @Override
    public abstract void prepare();
}
