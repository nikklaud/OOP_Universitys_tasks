class Cat extends Animal {
    public Cat(String name, double weight, double height, int age) {
        super(name, weight, height, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " мяукает: Мяу-мяу!");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест рыбу и корм для кошек.");
    }

    @Override
    public String getDescription() {
        return "Кот. " + super.getDescription();
    }
}
