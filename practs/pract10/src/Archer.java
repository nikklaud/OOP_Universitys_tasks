public class Archer extends Unit {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots an arrow!");
    }

    @Override
    public void defend() {
        System.out.println(name + " dodges quickly!");
    }
}
