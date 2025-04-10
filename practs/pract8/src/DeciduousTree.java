public class DeciduousTree extends AbstractTree {
    public DeciduousTree(String species, double height) {
        super(species, height);
    }

    @Override
    public void grow() {
        height += 0.7;
        System.out.println(species + " выросло. Новая высота: " + height + " м.");
    }
}
