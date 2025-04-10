package farm;

import animals.FarmAnimal;

import java.util.Iterator;
import java.util.LinkedList;

public class Farm {
    private LinkedList<FarmAnimal> animals;

    public Farm() {
        animals = new LinkedList<>();
    }

    public void addAnimal(FarmAnimal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " добавлен(а) на ферму.");
    }

    public void removeAnimal(String name) {
        Iterator<FarmAnimal> iterator = animals.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            FarmAnimal animal = iterator.next();
            if (animal.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println(name + " удален(а) с фермы.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Животное с именем " + name + " не найдено.");
        }
    }

    public void feedAllAnimals() {
        System.out.println("\nКормление всех животных:");
        for (FarmAnimal animal : animals) {
            animal.eat();
        }
    }

    public void makeAllSounds() {
        System.out.println("\nЖивотные издают звуки:");
        for (FarmAnimal animal : animals) {
            animal.makeSound();
        }
    }

    public void countAnimals() {
        System.out.println("\nНа ферме сейчас " + animals.size() + " животных.");
    }
}
