class HDD {
    int memory;
    int price;
    int weight;

    HDD() {
        this.memory = 0;
        this.price = 0;
        this.weight = 0;
    }

    HDD(int memory, int price, int weight) {
        this.memory = memory;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("HDD - Memory: " + memory + "GB, Price: " + price + "$, Weight: " + weight + "g");
    }
}  