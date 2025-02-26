class Laptop {
    String name;
    int price;
    int weight;
    HDD hardDiskDrive;
    CPU[] cpuMemory;

    Laptop(String name, int price, int weight, HDD hdd, CPU[] cpus) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.hardDiskDrive = hdd;
        this.cpuMemory = cpus;
    }

    int getTotalPrice() {
        int total = price + hardDiskDrive.price;
        for (CPU cpu : cpuMemory) {
            total += cpu.price;
        }
        return total;
    }

    int getTotalCPUMemory() {
        int total = 0;
        for (CPU cpu : cpuMemory) {
            total += cpu.cashMemory;
        }
        return total;
    }

    int getTotalWeight() {
        int total = weight + hardDiskDrive.weight;
        for (CPU cpu : cpuMemory) {
            total += cpu.weight;
        }
        return total;
    }
}  