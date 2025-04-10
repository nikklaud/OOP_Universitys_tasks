public class ConiferousTree extends AbstractTree {
    public ConiferousTree(String species, double height) {
        super(species, height);
    }

    @Override
    public void grow() {
        height += 0.5;
        System.out.println(species + " выросло. Новая высота: " + height + " м.");
    }
}
