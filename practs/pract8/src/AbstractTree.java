public abstract class AbstractTree implements Tree, Comparable<AbstractTree> {
    protected String species;
    protected double height;

    public AbstractTree(String species, double height) {
        this.species = species;
        this.height = height;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public int compareTo(AbstractTree other) {
        return Double.compare(this.height, other.height);
    }

    @Override
    public String toString() {
        return "Tree{species='" + species + "', height=" + height + "m}";
    }
}
