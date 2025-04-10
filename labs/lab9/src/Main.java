import buildings.House;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<House> houses = new ArrayList<>();

        houses.add(new House("ул. Ленина 1", 1990, 50, 2, false));
        houses.add(new House("ул. Мира 5", 2005, 75, 3, true));
        houses.add(new House("ул. Садовая 10", 2010, 100, 4, true));
        houses.add(new House("ул. Центральная 3", 1980, 120, 5, false));
        houses.add(new House("ул. Победы 8", 2020, 150, 6, true));

        Collections.sort(houses);

        System.out.println("Список домов после сортировки по жилой площади:");
        for (House house : houses) {
            System.out.println(house);
        }

        System.out.println("\nДома, пригодные для проживания:");
        for (House house : houses) {
            if (house.isSuitableForLiving()) {
                System.out.println(house);
            }
        }
    }
}
