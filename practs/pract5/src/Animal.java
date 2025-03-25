class Animal {
    String name;
    double weight;
    double height;
    int age;

    public Animal(String name, double weight, double height, int age) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("Неизвестный звук животного");
    }

    public void eat() {
        System.out.println("Животное питается");
    }

    public String getDescription() {
        return "Имя: " + name + ", Вес: " + weight + " кг, Рост: " + height + " м, Возраст: " + age + " лет.";
    }


}