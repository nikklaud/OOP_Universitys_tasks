public class Main {
    public static void main(String[] args) {
        // Задание 1
        String name = "Титов Никита";
        System.out.println("=== Задание 1 ===");
        System.out.println(name);

        CPU cpu1 = new CPU(16, 300, 150);
        cpu1.display();

        CPU[] cpus = {
                new CPU(16, 300, 150),
                new CPU(32, 500, 200),
                new CPU(8, 200, 120),
                new CPU(64, 700, 250)
        };

        int totalCPUCash = 0, totalCPUPrice = 0, totalCPUWeight = 0;
        for (CPU cpu : cpus) {
            cpu.display();
            totalCPUPrice += cpu.price;
            totalCPUCash += cpu.cashMemory;
            totalCPUWeight += cpu.weight;
        }
        System.out.println("Общая стоимость CPU: " + totalCPUPrice + "$");

        // Задание 2
        System.out.println("\n=== Задание 2 ===");
        System.out.println(name);


        HDD hdd1 = new HDD(512, 100, 500);
        HDD hdd2 = new HDD(1024, 150, 700);
        hdd1.display();
        hdd2.display();

        int totalHDDPrice = hdd1.price + hdd2.price;
        System.out.println("Общая стоимость HDD: " + totalHDDPrice + "$");

        // Задание 3
        System.out.println("\n=== Задание 3 ===");
        System.out.println(name);


        Laptop[] laptops = {
                new Laptop("Laptop1", 1000, 2000, hdd1, new CPU[]{cpus[0], cpus[1]}),
                new Laptop("Laptop2", 1200, 2200, hdd2, new CPU[]{cpus[2], cpus[3]}),
                new Laptop("Laptop3", 1500, 2500, hdd1, new CPU[]{cpus[0], cpus[1], cpus[2], cpus[3]}),
                new Laptop("Laptop4", 1800, 2800, hdd2, new CPU[]{cpus[0], cpus[1], cpus[2], cpus[3]}),
                new Laptop("Laptop5", 2000, 3000, hdd1, new CPU[]{cpus[0], cpus[1], cpus[2], cpus[3], cpus[0], cpus[1], cpus[2], cpus[3]}),
                new Laptop("Laptop6", 2200, 3200, hdd2, new CPU[]{cpus[0], cpus[1], cpus[2], cpus[3], cpus[0], cpus[1], cpus[2], cpus[3]})
        };

        int totalLaptopPrice = 0, totalLaptopCPUMemory = 0, totalLaptopWeight = 0;
        for (Laptop laptop : laptops) {
            System.out.println(laptop.name);
            totalLaptopPrice += laptop.getTotalPrice();
            totalLaptopCPUMemory += laptop.getTotalCPUMemory();
            totalLaptopWeight += laptop.getTotalWeight();
        }

        System.out.println("\nОбщая стоимость всех ноутбуков: " + totalLaptopPrice + "$");
        System.out.println("Общий объем кэш-памяти CPU в ноутбуках: " + totalLaptopCPUMemory + "MB");
        System.out.println("Общий вес всех ноутбуков: " + totalLaptopWeight + "g");
    }
}
