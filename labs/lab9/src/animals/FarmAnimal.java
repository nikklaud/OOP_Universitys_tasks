package animals;

public abstract class FarmAnimal implements Animal {
    protected String name;

    public FarmAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(name + " ест корм.");
    }

    @Override
    public abstract void makeSound();
}
