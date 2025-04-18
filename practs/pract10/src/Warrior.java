public class Warrior extends Unit {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " swings a sword!");
    }

    @Override
    public void defend() {
        System.out.println(name + " blocks with a shield!");
    }
}
