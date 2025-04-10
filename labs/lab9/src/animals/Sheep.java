package animals;

public class Sheep extends FarmAnimal {
    public Sheep(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Беее!");
    }
}
