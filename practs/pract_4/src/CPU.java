class CPU {
    int cashMemory;
    int price;
    int weight;

    CPU() {
        this.cashMemory = 0;
        this.price = 0;
        this.weight = 0;
    }

    CPU(int cashMemory, int price, int weight) {
        this.cashMemory = cashMemory;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("CPU - Cache Memory: " + cashMemory + "MB, Price: " + price + "$, Weight: " + weight + "g");
    }
}