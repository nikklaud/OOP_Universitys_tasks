import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import farm.Farm;

public class FarmSimulation {
    public static void main(String[] args) {
        Farm myFarm = new Farm();

        Cow cow = new Cow("Буренка");
        Chicken chicken = new Chicken("Петя");
        Sheep sheep = new Sheep("Абдурахман");

        myFarm.addAnimal(cow);
        myFarm.addAnimal(chicken);
        myFarm.addAnimal(sheep);

        myFarm.countAnimals();
        myFarm.makeAllSounds();
        myFarm.feedAllAnimals();

        myFarm.removeAnimal("Петя");
        myFarm.countAnimals();
    }
}
