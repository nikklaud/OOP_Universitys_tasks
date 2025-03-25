class Bear extends Animal {
    public Bear(String name, double weight, double height, int age) {
        super(name, weight, height, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " рычит: Р-р-р!");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест рыбу, мед и ягоды.");
    }

    @Override
    public String getDescription() {
        return "Медведь. " + super.getDescription();
    }
}