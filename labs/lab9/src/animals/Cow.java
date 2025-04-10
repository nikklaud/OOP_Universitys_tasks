package animals;

public class Cow extends FarmAnimal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Му-у-у!");
    }
}
