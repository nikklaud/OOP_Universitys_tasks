package animals;

public class Chicken extends FarmAnimal {
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Кукареку!");
    }
}
