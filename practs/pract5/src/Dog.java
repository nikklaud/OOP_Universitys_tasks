class Dog extends Animal {
    public Dog(String name, double weight, double height, int age) {
        super(name, weight, height, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " лает: Гав-гав!");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест мясо и корм для собак.");
    }

    @Override
    public String getDescription() {
        return "Собака. " + super.getDescription();
    }
}
