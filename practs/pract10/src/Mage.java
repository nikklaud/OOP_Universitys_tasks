public class Mage extends Unit {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a fireball!");
    }

    @Override
    public void defend() {
        System.out.println(name + " conjures a magic barrier!");
    }
}
